package com.renanfonseca.senha;

public class SenhaSeguraTest {

    public static void testCheckPassword(){
        SenhaSegura senhaSegura = new SenhaSegura();
        String[] passwords = {
                "#&!0aA", "#&!aaA", "bc0aA", "#&!0AA", "#&!0aa", "#&$!0"
        };

        int passwordsLength = passwords.length;
        int i = 0;
        while (passwordsLength > 0){
            System.out.println("Teste Nº: "+(i+1)+" -------------------");
            senhaSegura.checkPassword(passwords[i]);
            System.out.println("\n");
            i++;
            passwordsLength--;
        }

    }

}
