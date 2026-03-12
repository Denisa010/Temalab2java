
import java.util.Scanner;

public class ConversieBaza {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu numarul in baza 10: ");
        int numar = sc.nextInt();

        System.out.print("Introdu baza (2-16): ");
        int baza = sc.nextInt();

        String cifre = "0123456789ABCDEF";
        String rezultat = "";

        while (numar > 0) {
            rezultat = cifre.charAt(numar % baza) + rezultat;
            numar = numar / baza;
        }

        System.out.println("Numarul convertit este: " + rezultat);
    }
}