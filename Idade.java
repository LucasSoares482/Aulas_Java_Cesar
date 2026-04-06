import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 18) {
            System.out.println("Adolescente");
        } else if (idade <= 64) {
            System.out.println("Adulto");
        } else if (idade <= 100) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }

    }
}
