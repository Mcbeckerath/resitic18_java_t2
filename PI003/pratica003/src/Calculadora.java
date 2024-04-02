public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida!");
        }
        return dividendo / divisor;
    }

    public float dividir(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0.0f) {
            throw new DivisionByZeroException("Divisão por zero não é permitida!");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            int resultadoDivisaoInteira = calculadora.dividir(10, 2);
            System.out.println("Resultado da divisão inteira: " + resultadoDivisaoInteira);

            float resultadoDivisaoFloat = calculadora.dividir(5.0f, 2.0f);
            System.out.println("Resultado da divisão float: " + resultadoDivisaoFloat);

            int resultadoDivisaoPorZero = calculadora.dividir(8, 0);
            System.out.println("Isso não será impresso, pois uma exceção será lançada.");
        } catch (DivisionByZeroException e) {
            System.err.println(e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

