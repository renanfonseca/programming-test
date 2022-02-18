package com.renanfonseca.anagrama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Anagrama {

    private static ArrayList<String> subStrings(String str, int n) {
        ArrayList<String> subStrings = new ArrayList<>();

        for (int i = 0; i < n; i++){
            for (int j = i+1; j <= n; j++){
                subStrings.add(str.substring(i, j).toLowerCase());
            }
        }

        return subStrings;
    }

   public static int anagramPairs(String str) {
       ArrayList<String> subStrings = new ArrayList<>();
       subStrings = subStrings(str, str.length());

       char[] auxA = {};
       char[] auxB = {};
       int qtAnagranm = 0;

       for (int i = 0; i < subStrings.size(); i++) {
           int j = i;
           for ( j += 1; j < subStrings.size(); j++){
               if (subStrings.get(i).length() == subStrings.get(j).length()) {

                   auxA = (subStrings.get(i).toCharArray()) ;
                   Arrays.sort(auxA);

                   auxB = subStrings.get(j).toCharArray();
                   Arrays.sort(auxB);

                   if(Arrays.equals(auxA, auxB)){
                       ++qtAnagranm;
                   }

               }
           }

       }
       return qtAnagranm;
   }
}
