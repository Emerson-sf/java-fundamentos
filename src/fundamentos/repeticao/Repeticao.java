package fundamentos.repeticao;

public class Repeticao {

    public static void main(String[] args){

        /*int numero = 1;
         do {
            System.out.println(numero);
            numero++;
        } while (numero <= 5);*/

        for(int i = 1; i <= 20; i++){
            if(i % 2 == 1){
                System.out.println(i + " é ímpar");
            }
            else {
                System.out.println(i + " é par");
            }
        }
    }
}
