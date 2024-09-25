package br.com.jr.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int GetTemporadas(){
        return temporadas;
    }

    public void SetTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int GetEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void SetEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean GetAtiva(){
        return ativa;
    }

    public void SetAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int GetMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void SetMinutosPorEpisodio(int minutosPorepisodio){
        this.minutosPorEpisodio = minutosPorepisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
