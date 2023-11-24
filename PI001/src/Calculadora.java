
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        double  num1, num2, result = 0;
        int escolha;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operacao:");
        System.out.println("1. Adição");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        System.out.print("Digite o numero da operacao desejada: ");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O resultado da operação é: " + result);

        scanner.close();
    }
        
    }

