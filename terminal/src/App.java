import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Prompt the user to enter their first name
        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        // Prompt the user to enter their last name
        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        // Print the full name
        System.out.println("Sou " + nome + " " + sobrenome);

        // Close the scanner
        scanner.close();
    }
}
