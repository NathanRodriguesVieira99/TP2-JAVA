import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do seu salário bruto anual: ");
        double salarioBrutoAnual = scanner.nextDouble();

        double imposto = 0;

        if (salarioBrutoAnual <= 22000) {
            imposto = 0;
            System.out.println("Isento (0% de imposto)");
        } else if (salarioBrutoAnual > 22000 && salarioBrutoAnual <= 50000) {
            imposto = (salarioBrutoAnual - 22000) * 0.075;
            System.out.println("7,5% de imposto");
        } else if (salarioBrutoAnual > 50000 && salarioBrutoAnual <= 100000) {
            imposto = (50000 - 22000) * 0.075 + (salarioBrutoAnual - 50000) * 0.15;
            System.out.println("15% de imposto");
        } else if (salarioBrutoAnual > 100000) {
            imposto = (50000 - 22000) * 0.075 + (100000 - 50000) * 0.15 + (salarioBrutoAnual - 100000) * 0.225;
            System.out.println("22,5% de imposto");
        }

        double salarioLiquido = salarioBrutoAnual - imposto;

        System.out.println("Você vai pagar em impostos, R$: " + String.format("%.2f", imposto));
        System.out.println("Seu salário final será, R$: " + String.format("%.2f", salarioLiquido));

        scanner.close();
    }
}