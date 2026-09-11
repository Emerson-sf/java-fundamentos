package fundamentos.entrada;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Sua cidade é: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos, mede " + altura + "m e mora em " + cidade);
    }
}
