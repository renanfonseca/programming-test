package com.renanfonseca.escada;

import java.util.Random;

public class EscadaTest {

    public static void testCreateLadder(){
        Escada escada = new Escada();
        Random random = new Random();

        for(int i = 0; i < 5; i++) {
            System.out.println("Teste Nº: "+(i+1)+" -------------------");
            escada.createLadder(random.nextInt(10));
            System.out.println("\n");
        }

    }

}
