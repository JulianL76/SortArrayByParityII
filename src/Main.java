
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = 100;
        boolean first = true;
        while (casos != 0) {
            // Leer la entrada del usuario
            String input = scanner.nextLine();
            String[] strNums = input.split(" ");
            int[] nums = new int[strNums.length];
            for (int i = 0; i < strNums.length; i++) {
                nums[i] = Integer.parseInt(strNums[i]);
            }

            // Llamar al método sortArrayByParityII y mostrar el resultado
            int[] result = sortArrayByParityII(nums);

            if (first) {
                System.out.println("El array ordenado es: ");
                first = false;
            } else {
                System.out.println("");
                System.out.println("El array ordenado es: ");
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            casos--;
        }
    }

    /**
     * Ordena un Arreglo, los números pares en posiciones pares, y los números
     * impares en posiciones impares.
     *
     * @param nums un Arreglo de números enteros, con número igual de pares e
     * impares.
     * @return un Arreglo con los números ordenados.
     */

    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        while (true) {
            while (even < nums.length && nums[even] % 2 == 0) {
                even += 2;
            }
            while (odd < nums.length && nums[odd] % 2 == 1) {
                odd += 2;
            }
            if (odd >= nums.length || even >= nums.length) {
                return nums;
            }

            int temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
        }

    }
}
