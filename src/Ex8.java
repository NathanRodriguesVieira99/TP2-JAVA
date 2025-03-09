
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o 1 comprimento: ");
        int comprimento1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o 2 comprimento: ");
        int comprimento2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o 3 comprimento: ");
        int comprimento3 = scanner.nextInt();
        scanner.nextLine();

        if (comprimento1 + comprimento2 > comprimento3 &&
                comprimento1 + comprimento3 > comprimento2 &&
                comprimento2 + comprimento3 > comprimento1) {

            if (comprimento1 == comprimento2 && comprimento2 == comprimento3) {
                System.out.println("Equilatero");
            } else if (comprimento1 == comprimento2 || comprimento1 == comprimento3 || comprimento2 == comprimento3) {
                System.out.println("Isoceles");
            } else if (comprimento1 != comprimento2 && comprimento2 != comprimento3) {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("As mediadas nao formam triangulos!");
        }
        scanner.close();
    }
}
