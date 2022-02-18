package com.renanfonseca.senha;

import java.util.*;

public class SenhaSegura {

    private  int passwordLength;
    private String[] specialCharacters = {
            "!","@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"
    };

    public void checkPassword(String password) {
        this.passwordLength = password.length();

        if (checkPasswordLength(this.passwordLength)) {
            if (isNumber(password) && hasSpecialCharacter(password) && hasALowercaseLetter(password)
                    && hasAUppercaseLetter(password)){
                System.out.println("Senha Segura!");
            } else {
                System.out.println("A senha também precisa possui no mínimo: \n" +
                        " 1 digito\n" +
                        " 1 letra em minúsculo\n" +
                        " 1 letra em maiúsculo\n" +
                        " 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
            }
        } else {
            System.out.println("Senha precisa possui no mínimo 6 caracteres. Falta: " + (6 - this.passwordLength) );
        }
    }

    private boolean hasALowercaseLetter(String password){
        int length = password.length();
        String charToString;
        String uppercase;

        for(int i = 0; i < length; i++){
            charToString = Character.toString(password.charAt(i));
           if(!hasSpecialCharacter(charToString)){
               if(!isNumber(charToString)){
                   uppercase = charToString.toUpperCase();
                   if (!(uppercase == charToString)) {
                       return true;
                   }
               }
           }
        }
        return false;
    }

    private boolean hasAUppercaseLetter(String password){
        int length = password.length();
        String charToString;
        String uppercase;

        for(int i = 0; i < length; i++){
            charToString = Character.toString(password.charAt(i));
            if(!hasSpecialCharacter(charToString)){
                if(!isNumber(charToString)){
                    uppercase = charToString.toUpperCase();
                    if ((uppercase == charToString)) {
                       return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean hasSpecialCharacter(String password){
        String charToString;

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < this.specialCharacters.length; j++){
                charToString = Character.toString(password.charAt(i));
                if (this.specialCharacters[j].equals(charToString)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkPasswordLength(int passwordLength){
        return (passwordLength >= 6) ? true :  false;
    }

    private boolean isNumber(String password){
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
