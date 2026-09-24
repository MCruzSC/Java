package calculadora;
import java.util.Scanner;


import java.util.Scanner;

public class Main {
    void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double entrada = leitor.nextDouble();

        System.out.println("Digite sua operação ...");
        String operacao;
        do {
            System.out.println(" + | - | / | * ");
            operacao = leitor.next();
        } while (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("/") && !operacao.equals("*"));

        System.out.println("Digite o segundo numero");
        double entrada2 = leitor.nextDouble();
        double resultado = 0;

        switch (operacao) {
            case "+":
                Adicao adicao = new Adicao();
                resultado = adicao.calcular(entrada, entrada2);
                break;
            case "-":
                Subtracao subtracao = new Subtracao();
                resultado = subtracao.calcular(entrada, entrada2);
                break;
            case "*":
                Multiplicacao multiplicacao = new Multiplicacao();
                resultado = multiplicacao.calcular(entrada, entrada2);
                break;
            case "/":
                if (entrada2 != 0) {
                    Divisao divisao = new Divisao();
                    resultado = divisao.calcular(entrada, entrada2);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    leitor.close();
                    return;
                }
                break;
        }

        System.out.println("Resultado: " + resultado);
        leitor.close();
    }
}
