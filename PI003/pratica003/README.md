## PO-03
DESENVOLVER CONCEITOS INICIAIS DE PROGRAMAÇÃO EM jAVA 

>Aluno: Matheus Costa Beckerath

## DESCRIÇÃO DA ATIVIDADE 


- 1 - O que é uma exceção em Java e qual é o propósito de usá-las em programas?
>Em Java, uma exceção é um evento anormal que ocorre durante a execução de um programa e interrompe o fluxo normal de instruções. As exceções representam situações de erro ou condições imprevistas que podem ocorrer durante a execução do código. O propósito de usar exceções é lidar com essas situações de maneira controlada, permitindo que o programador trate ou contorne os erros de forma apropriada, melhorando a robustez e a manutenibilidade do código

- 2 -Pesquise sobre a diferença entre exceções verificadas e não verificadas em
Java. Dê exemplos de cada uma
>As exceções em Java são divididas em dois tipos: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).
>Exceções verificadas (checked exceptions): São exceções que o compilador obriga o programador a tratar ou propagar. Isso significa que o código que pode gerar exceções verificadas deve ser colocado dentro de um bloco try-catch ou declarar que o método lança essas exceções. Exemplos incluem IOException e SQLException.
try {
    FileReader file = new FileReader("arquivo.txt");
    // Operações de leitura
} catch (IOException e) {
    // Tratamento da exceção
    e.printStackTrace();
}

>Exceções não verificadas (unchecked exceptions): São exceções que o compilador não exige que sejam tratadas explicitamente. Geralmente, são erros de programação ou condições que o programador não tem controle. Exemplos incluem NullPointerException e ArrayIndexOutOfBoundsException.

> int[] array = new int[5];
System.out.println(array[10]);
- 3 - Como você pode lidar com exceções em Java? Quais são as palavras-chave e
as práticas comuns para tratamento de exceções?

>Em Java, as palavras-chave relacionadas ao tratamento de exceções incluem:

    try: Define um bloco de código onde exceções podem ocorrer.
    catch: Captura e trata exceções que são lançadas dentro do bloco try.
    finally: Define um bloco de código que sempre será executado, independentemente de ocorrer uma exceção ou não.
    throw: Lança manualmente uma exceção.
    throws: Indica que um método pode lançar exceções específicas.

Práticas comuns incluem:

    Tratamento específico: Capturar exceções específicas para lidar com diferentes tipos de erros de maneira apropriada.
    Bloco finally: Utilizar o bloco finally para garantir que determinado código seja executado, independentemente de ocorrer ou não uma exceção.
    Relançar exceções: Em alguns casos, é apropriado relançar exceções após algum tratamento específico.

- 4 - O que é o bloco "try-catch" em Java? Como ele funciona e por que é
importante usá-lo ao lidar com exceções?

> O bloco try-catch é utilizado para envolver um bloco de código onde exceções podem ocorrer. O código dentro do bloco try é monitorado para exceções, e se uma exceção ocorre, o fluxo de controle é transferido para o bloco catch correspondente, onde o tratamento da exceção é definido. É importante usar o bloco try-catch para lidar com exceções de forma controlada, evitando que erros não tratados causem a interrupção abrupta do programa.

- 5 -  Quando é apropriado criar suas próprias exceções personalizadas em Java e
como você pode fazer isso? Dê um exemplo de quando e por que você criaria
uma exceção personalizada

>É apropriado criar exceções personalizadas em Java quando você tem situações específicas no seu código que não podem ser representadas adequadamente por exceções padrão do Java. Criar exceções personalizadas permite uma semântica mais clara e específica para os erros no seu domínio de aplicação.
Para criar uma exceção personalizada, você deve criar uma classe que estenda Exception ou outra classe base de exceção



Calculadora de Divisão
Crie uma classe Calculadora com métodos para as 4 operações. Note que
haverá um método que realiza uma divisão de dois números inteiros e outro que
realizará a divisão de dois números float. No entanto, se o divisor for igual a zero,
sua calculadora deverá lançar uma exceção personalizada chamada
DivisionByZeroException. O seu programa deve lidar com essa exceção e informar ao
usuário que a divisão por zero não é permitida