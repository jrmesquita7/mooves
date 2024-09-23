import br.com.jr.screenmatch.calculo.Calculadora;
import br.com.jr.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Filme filme2 = new Filme();
        Calculadora calculadora = new Calculadora();


        filme2.setNome("One Piece");
        filme2.setDuracaoEmMinutos(180);

        meuFilme.setNome("Homem Aranha");
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8.5);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.pegaMedia();


        calculadora.inclui(filme2);
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        }

    }
