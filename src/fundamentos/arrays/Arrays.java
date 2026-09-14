package fundamentos.arrays;

public class Arrays {

    public static void main(String[] args){

        int[] numeros = {10,20,30,40,50};

        int menor = numeros[0];
        numeros[2] = 100;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Menor valor: " + menor);
    }
}
