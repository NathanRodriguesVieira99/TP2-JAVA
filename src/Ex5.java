
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");

        double valor = scanner.nextDouble();

        double desconto = 0;
        
        if (valor > 1000) {
            desconto = valor * 0.10;
        } else if (valor >= 500 && valor <= 1000) {
            desconto = valor * 0.05;
        } else {
            desconto = 0;
        }
        double valorComDesconto = valor - desconto;

        System.out.println("Valor da compra: " + valor);
        System.out.println("Desconto na compra: " + desconto);
        System.out.println("Valor com desconto: " + valorComDesconto);

        scanner.close();
    }
}
