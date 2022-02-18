package com.renanfonseca.anagrama;

public class AnagramaTest {

    public static void testAnagramPairs() {

        String[] anagramas = {
                "ovo", "ifailuhkqq", "casa", "lua", "Annanda", "Renan"
        };

        int anagramasLength = anagramas.length;
        int i = 0;
        while (anagramasLength > 0) {
            System.out.println("Teste Nº: "+(i+1)+" -------------------");
            System.out.println(Anagrama.anagramPairs(anagramas[i]));;
            System.out.println("\n");
            i++;
            --anagramasLength;
        }
    }
}
