package br.com.jr.screenmatch.calculo;
import br.com.jr.screenmatch.modelos.Titulo;


public class Calculadora {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo titulos){
        tempoTotal += titulos.getDuracaoEmMinutos();
    }

}
