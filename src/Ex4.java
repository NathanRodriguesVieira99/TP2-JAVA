
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu dia de nascimento: ");
        int diaNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe seu mes de nascimento: ");
        int mesNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();

        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);

        LocalDate dataAtual = LocalDate.now();

        long diasVida = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("Seus dias de vida são: " + diasVida);

        scanner.close();

    }
}
