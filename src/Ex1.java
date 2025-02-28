import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome completo: ");
        String userName = scanner.nextLine();

        System.out.println("Escreva sua idade: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escreva o nome do seu pai: ");
        String father = scanner.nextLine();

        System.out.println("Escreva o nome da sua mãe: ");
        String mother = scanner.nextLine();

        System.out.println("Nome commpleto e idade são: " + userName + " e " + userAge + " anos.");

        System.out.println("Nome dos pais: " + father + " e " + mother);

        if (userName.length() > father.length()) {
            System.out.println("Nome do filho é maior que do pai");
        } else {
            System.out.println("Nome do pai é maior que o do filho");
        }
        if (userName.length() > mother.length()) {
            System.out.println("Nome do filho é maior que da mae");
        } else {
            System.out.println("Nome da  mae é maior que o do filho");
        }

        scanner.close();
    }
}