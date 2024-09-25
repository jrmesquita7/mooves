import br.com.jr.screenmatch.calculo.Calculadora;
import br.com.jr.screenmatch.calculo.FiltroRecomendacao;
import br.com.jr.screenmatch.modelos.Episodio;
import br.com.jr.screenmatch.modelos.Filme;
import br.com.jr.screenmatch.modelos.Serie;

import java.io.File;
import java.io.Serial;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Homem Aranha", 2001);
        Filme filme2 = new Filme("One Piece", 1999);
        Calculadora calculadora = new Calculadora();

        filme2.setDuracaoEmMinutos(180);


        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8.5);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.pegaMedia();


        filme2.exibeFichaTecnica();
        calculadora.inclui(filme2);
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        Serie serie = new Serie("One Piece", 1999);


        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalViews(300);
        filtro.filtra(episodio);


        // new

        ArrayList<Filme> listaFilme = new ArrayList<>();

        listaFilme.add(meuFilme);
        listaFilme.add(filme2);

        System.out.println(listaFilme.size());

        System.out.println(listaFilme.get(0).getNome());

        // Linha removida

        for (Filme filme : listaFilme) {
            System.out.println(filme.getNome());
        }
        }

    }
