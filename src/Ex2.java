
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        int firstNote = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a segunda nota");
        int secondNote = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a  terceira nota");
        int thirdNote = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a quarta nota");
        int fourthNote = scanner.nextInt();
        scanner.nextLine();

        int mediaNotas = (firstNote + secondNote + thirdNote + fourthNote) / 4;

        if (mediaNotas >= 7) {
            System.out.println("Voce esta aprovado");
        } else if (mediaNotas >= 5 && mediaNotas <= 6.9) {
            System.out.println("Voce esta em recuperacao");
        } else {
            System.out.println("Voce reprovou");
        }

    }
}
