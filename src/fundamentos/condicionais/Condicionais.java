package fundamentos.condicionais;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10){
            System.out.println("inválida");
        }else if (nota >= 7){
            System.out.println("Aprovado");
        }else if (nota >= 5){
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}

    /*public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println
                ("1 - Ver saldo \n" +
                        "2 - Depósito selecionado \n" +
                        "3 - Sair");

        int opcao =  scanner.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Seu saldo é: R$ 1000");
                break;

            case 2:
                System.out.println("Depósito selecionado");
                break;

            case 3:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }*/


