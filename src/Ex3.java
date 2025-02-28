
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        double taxaYen = 3.24;
        double taxaDolarZimbabwe = 55.12;
        double taxaLibraEgipcia = 0.114;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu valor em R$: ");
        int valorReais = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a moeda que deseja converter: ");
        String moedaEscolhida = scanner.nextLine();

        double valorConvertido = 0;

        if (moedaEscolhida.equalsIgnoreCase("Yen")) {
            valorConvertido = valorReais * taxaYen;
        } else if (moedaEscolhida.equalsIgnoreCase("DolarZimbabwe")) {
            valorConvertido = valorReais * taxaDolarZimbabwe;
        } else if (moedaEscolhida.equalsIgnoreCase("LibraEgipcia")) {
            valorConvertido = valorReais * taxaLibraEgipcia;
        } else {
            System.out.println("Moeda nao reconhecida");
        }

        System.out.println("Valor convertido: " + valorConvertido);

        scanner.close();
    }
}
