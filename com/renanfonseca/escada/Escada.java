package com.renanfonseca.escada;

public class Escada {

    private String[] ladder;
    private String showLadder;

    public Escada(){
    }

    private String[] getLadder(){
        return this.ladder;
    }

    public void createLadder(int tamanho){
        this.ladder = new String[tamanho];
        clearLadder(tamanho);
        while (tamanho > 0) {
            this.ladder[tamanho-1] = "*";
            System.out.println(showLadder(getLadder()));
            --tamanho;
        }
    }

    private void clearLadder(int tamanho) {
        for(int i = tamanho; i > 0; i--){
            this.ladder[i-1] = " ";
        }
    }

    private String showLadder(String[] ladder){
        this.showLadder = String.join("",ladder);
        return this.showLadder;
    }
}
