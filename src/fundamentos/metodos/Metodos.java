package fundamentos.metodos;

public class Metodos {

    public static void main(String[] args){

        /*int resultado = somar(3,4);
        System.out.println(resultado);*/

        /*double resultado = calcularMedia(8.0, 6.0);
        System.out.println("Média: " + resultado);*/

        /*boolean resultado = numeroPar(20);
        System.out.println(resultado);*/

        /*String resultado = verificarNota(6.5);
        System.out.println(resultado);*/

        double resultado = calcularDesconto(100,10);
        System.out.println(resultado);
    }

    public static int somar(int a, int b){

        return a + b;
    }

    public static double calcularMedia(double nota1, double nota2){

        return (nota1 + nota2)/2;
    }

    public static int calculoNumeroPar(int a){

        return a % 2;
    }

    public static boolean numeroPar(int numero){

        return numero % 2 == 0;
    }

    public static String verificarNota(double nota){

        if(nota >= 7) {
           return "Aprovado";
        } else if(nota >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularDesconto(double preco, double percentual){

        return preco - (preco * (percentual/100));
    }
}
