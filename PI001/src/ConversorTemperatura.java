import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
        char unidadeOrigem = scanner.next().charAt(0);

        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
            double resultado = celsiusParaFahrenheit(temperatura);
            System.out.println("A temperatura em Fahrenheit eh: " + resultado);
        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
            double resultado = fahrenheitParaCelsius(temperatura);
            System.out.println("A temperatura em Celsius eh: " + resultado);
        } else {
            System.out.println("Opcao de unidade de origem invalida.");
        }

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}


