import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double valorInicial = scanner.nextDouble();


        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;


        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for (int ano = 1; ano <= periodo; ano++) {
            valorFinal += valorFinal * taxaJuros;
        }

        DecimalFormat df = new DecimalFormat("####.00");


        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}