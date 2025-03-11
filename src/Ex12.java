
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a frase: ");
        String fraseInformada = scanner.nextLine();

        String[] palavrasDaFrase = fraseInformada.split(" ");

        int palavras = palavrasDaFrase.length;

        System.out.println("Total de palavras: " + palavras);
    }
}
