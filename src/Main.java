import br.com.jr.screenmatch.modelos.Titulo;

public class Main {
    public static void main(String[] args) {
        Titulo meuFilme = new Titulo();
        meuFilme.setNome("Homem Aranha");
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avalia(8.5);
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        meuFilme.exibeFichaTecnica();

        meuFilme.pegaMedia();
        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());
        }
    }
