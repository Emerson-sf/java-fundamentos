package fundamentos.operadores;

public class Operadores {

    public static void main(String[] args) {

        /*Operadores de Comparação

        int idade = 22;

        boolean maiorDe18 = idade > 18;

        System.out.println(maiorDe18);

        System.out.println("Idade maior que 18: " + (idade > 18));
        System.out.println("Idade menor que 18: " + (idade < 18));
        System.out.println("Idade maior ou igual que 18: " + (idade >= 18));
        System.out.println("Idade menor ou igual que 18: " + (idade <= 18));
        System.out.println("Idade é igual a 18: " + (idade == 18));
        System.out.println("Idade é diferente de 18: " + (idade != 18));
        -------------------------------------------------------------------*/

        //Operadores Lógicos//

        int idade = 22;

        boolean estudante = true;
        boolean empregado = false;

        System.out.println("É maior de idade e estudante: " + (idade >= 18 && estudante));

        System.out.println("É maior de idade e empregado: " + ( idade >= 18 && empregado));

        System.out.println("É estudante ou empregado: " + (estudante || empregado));

        System.out.println("Não é estudante? " + (!estudante));

        System.out.println("Não é empregado? " + (!empregado));


    }
}
