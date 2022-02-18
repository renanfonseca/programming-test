import com.renanfonseca.anagrama.Anagrama;
import com.renanfonseca.escada.Escada;
import com.renanfonseca.senha.SenhaSegura;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        boolean trueOrFalse = true;
        String op = "";
        String tamanhoEscada = "";
        String senha = "";
        String qualAnagrama = "";

        Scanner sc = new Scanner(System.in);
        Escada escada = new Escada();
        SenhaSegura senhaSegura = new SenhaSegura();

        while (trueOrFalse) {
            System.out.println("----------- MENU -----------");
            System.out.println("| Criar Escada [1]");
            System.out.println("| Verificar Senha Segura [2]");
            System.out.println("| Verificar Pares de Substrings de uma String [3]");
            System.out.print("\n -> Digite sua opção ou '0' para sair do programa: ");


            try {
                op = sc.nextLine();

                System.out.println("    Numero Digitado: " +op);

                switch (op) {
                    case "1":
                        System.out.print("    -> Informe o tamanho da escada, em número: ");
                        tamanhoEscada = sc.nextLine();
                        escada.createLadder(Integer.parseInt(tamanhoEscada));
                        break;

                    case "2":
                        System.out.print("    -> Informe a senha: ");
                        senha = sc.nextLine();
                        System.out.print("    Resultado: ");
                        senhaSegura.checkPassword(senha);
                        break;

                    case "3":
                        System.out.print("    -> Qual palavra quer verificar os pares de Anagramas? ");
                        qualAnagrama = sc.nextLine();
                        System.out.println("     Resultado: "+Anagrama.anagramPairs(qualAnagrama));;
                        break;

                    case "0":
                        System.out.println("\nSaindo...");
                        return;

                    default:
                        System.out.println("    Opção Invalida!\n");
                }
            } catch (Exception e) {
                System.out.println("    Saindo...");
                break;
            } finally {
                System.out.println("-------------------------");
            }
       }
    }


}