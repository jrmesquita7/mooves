package br.com.jr.screenmatch.calculo;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os melhores do momento");
        }else if(classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        }else {
            System.out.println("Adicione em sua lista");
        }
    }
}
