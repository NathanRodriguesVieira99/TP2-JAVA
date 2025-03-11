
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma senha: ");
        String senha = scanner.nextLine();

        String senhaCorreta;

        do {
            System.out.println("Escreva a senha certa: ");
            senhaCorreta = scanner.nextLine();

            if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha errada!");
            }
        } while (!senha.equals(senhaCorreta));

        System.out.println("Senha correta!");
    }
}
