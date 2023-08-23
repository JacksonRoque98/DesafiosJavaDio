import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu saldo atual: ");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Por favor, digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        System.out.println("Por favor, digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();

        double novoSaldo = saldoAtual + (valorDeposito-valorSaque);

        System.out.println("Saldo atualizado na conta: R$"+novoSaldo);

    }
}
