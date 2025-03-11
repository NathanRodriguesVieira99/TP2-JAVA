
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        int numeroAleatorio = (int) Math.floor(Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);

        int userPalpite;

        do {
            System.out.println("Informe seu palpite entre 1 e 100: ");
            userPalpite = scanner.nextInt();
            
            if (userPalpite < 1 || userPalpite > 100) {
                System.out.println("Insira apenas numeros entre 1 e 100");
            }

            if (userPalpite > numeroAleatorio) {
                System.out.println("O numero gerado é menor");
            } else if (userPalpite < numeroAleatorio) {
                System.out.println("O numero é maior");
            } else {
                System.out.println("Boa! você acertou o numero!!");
            }
        } while (userPalpite != numeroAleatorio);
    }
}
