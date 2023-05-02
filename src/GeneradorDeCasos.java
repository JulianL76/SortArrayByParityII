
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeneradorDeCasos {
    /**
     * Salida 
     * @param args 
     */
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            generarCaso1();
        }
        for (int i = 0; i < 20; i++) {
            generarCaso2();
        }
        for (int i = 0; i < 20; i++) {
            generarCaso3();
        }
        for (int i = 0; i < 20; i++) {
            generarCaso4();
        }
        for (int i = 0; i < 20; i++) {
            generarCaso5();
        }
    }

    /**
     * Caso 1.
     * Genera e imprime un arreglo de de enteros desordenados con igual numero de pares e impares
     * Example: [5, 4, 3, 2] , [27, 12, 10, 43] , [34, 34, 27, 17, 8, 15].
     */
    public static void generarCaso1() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int tamaño = random.nextInt(500) * 2 + 2;

        for (int i = 0; i < tamaño / 2; i++) {
            int elemento = random.nextInt(501) * 2;
            lista.add(elemento);
        }
        for (int i = tamaño / 2; i < tamaño; i++) {
            int elemento = random.nextInt(500) * 2 + 1;
            lista.add(elemento);
        }
        Collections.shuffle(lista);
        System.out.println(listaToString(lista));
    }

   
    /**
     * Caso 2.
     * Genera e imprime un arreglo de enteros mitad numeros pares seguido de la mitad de numeros impares.
     * Example: [2, 4, 3, 5] , [10, 12, 27, 43] , [34, 34, 8, 17, 27, 15].
     */
    public static void generarCaso2() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int tamaño = random.nextInt(500) * 2 + 2;

        for (int i = 0; i < tamaño / 2; i++) {
            int elemento = random.nextInt(501) * 2;
            lista.add(elemento);
        }
        for (int i = tamaño / 2; i < tamaño; i++) {
            int elemento = random.nextInt(500) * 2 + 1;
            lista.add(elemento);
        }
        System.out.println(listaToString(lista));
    }

    /**
     * Caso 3.
     * Genera e imprime un arreglo de enteros mitad numeros impares seguido de la mitad de numeros pares. 
     * Example: [3, 5, 2, 4] , [27, 43, 10, 12] , [17, 27, 15, 34, 34, 8].
     */
    public static void generarCaso3() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int tamaño = random.nextInt(500) * 2 + 2;

        for (int i = 0; i < tamaño / 2; i++) {
            int elemento = random.nextInt(501) * 2 + 1;
            lista.add(elemento);
        }
        for (int i = tamaño / 2; i < tamaño; i++) {
            int elemento = random.nextInt(500) * 2;
            lista.add(elemento);
        }
        System.out.println(listaToString(lista));
    }

    /**
     * Caso 4.
     * Genera e imprime un arreglo de enteros con numeros pares en pocisiones impares y numeros impares en pocisiones pares. 
     * Example: [3, 2, 5, 4] , [27, 10, 43, 12] , [17, 34, 15, 34, 27, 8].
     */
    public static void generarCaso4() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int tamaño = random.nextInt(500) * 2 + 2;
        for (int i = 0; i < tamaño; i++) {
            int elemento;
            if (i % 2 == 0) {
                elemento = random.nextInt(501) * 2 + 1;
                lista.add(elemento);
            } else {
                elemento = random.nextInt(501) * 2;
                lista.add(elemento);
            }
        }
        System.out.println(listaToString(lista));
    }

     /**
     * Caso 5.
     * Genera e imprime un arreglo de enteros con numeros pares en pocisiones pares y numeros impares en pocisiones impares. 
     * Example: [2, 5, 4, 5] , [10, 43, 12, 27] , [34, 27, 8, 17, 34, 15].
     */
    public static void generarCaso5() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int tamaño = random.nextInt(500) * 2 + 2;
        for (int i = 0; i < tamaño; i++) {
            int elemento;
            if (i % 2 != 0) {
                elemento = random.nextInt(501) * 2;
                lista.add(elemento);
            } else {
                elemento = random.nextInt(501) * 2 + 1;
                lista.add(elemento);
            }
        }
        System.out.println(listaToString(lista));
    }

     /**
     * Convierte en contenido de un Arreglo a un String.
     *
     * @param lista a convetir.
     * @return un String con el contenido del arreglo
     */
    public static String listaToString(ArrayList<Integer> lista) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i));
            if (i < lista.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
