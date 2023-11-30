import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ManipulaArray {
    

      public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo + 1); 
        }

        return array;
    }    

    public static int calcularSomaArray(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }    

public static void main(String[] args) {

        int[] arrayDoUsuario = criarArrayDoUsuario();
        System.out.println("Array do usuário: " + Arrays.toString(arrayDoUsuario));
        System.out.println("Soma do array do usuário: " + calcularSomaArray(arrayDoUsuario));

        

        int[] arrayAleatorio = criarArrayAleatorio(5, 100);
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));
        System.out.println("Soma do array aleatório: " + calcularSomaArray(arrayAleatorio));

    }
}