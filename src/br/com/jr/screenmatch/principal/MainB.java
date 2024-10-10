package br.com.jr.screenmatch.principal;

import br.com.jr.screenmatch.excecao.ErroDeConversaoException;
import br.com.jr.screenmatch.modelos.Titulo;
import br.com.jr.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner leitura = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String busca = "";

        List<Titulo> lista = new ArrayList<>();

        while(!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=4b2106a9";


            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);

                System.out.println(tituloOmdb);


                Titulo titulo1 = new Titulo(tituloOmdb);
                System.out.println(titulo1);

                lista.add(titulo1);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na busca");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoException e) {
                System.out.println(e.getMessage());
            }
        }

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(lista));
        escrita.close();
    }
}