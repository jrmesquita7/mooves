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
        Filme meuFilme = new Filme();
        Filme filme2 = new Filme();
        Calculadora calculadora = new Calculadora();


        filme2.setNome("One Piece");
        filme2.setDuracaoEmMinutos(180);
        filme2.setAnoDeLancamento(1999);
        filme2.setDiretor("Eichiro Oda");

        meuFilme.setNome("Homem Aranha");
        meuFilme.setAnoDeLancamento(2012);
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
        Serie serie = new Serie();
        serie.setNome("One Piece");

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

        System.out.println(listaFilme);

        for (Filme filme : listaFilme) {
            System.out.println(filme.getNome());
        }
        }

    }
