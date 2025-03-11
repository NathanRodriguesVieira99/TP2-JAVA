
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.println("Informe o incremento: ");
        int incremento = scanner.nextInt();

        int valorAtual = valorInicial;

        String sequencia = "";

        while (valorAtual <= 100) {
            sequencia += valorAtual;

            if (valorAtual + incremento <= 100) {
                sequencia += ", ";
            }

            valorAtual += incremento;
        }

        System.out.println("Sequencia: " + sequencia);
    }
}
