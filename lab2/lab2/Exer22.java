import java.util.Scanner;

/**
 *
 */
public class Exer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un an: ");
        int year = scanner.nextInt();

        // Verificăm dacă anul este bisect
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " este un an bisect.");
        } else {
            System.out.println(year + " nu este un an bisect.");
        }

        scanner.close();
    }
}