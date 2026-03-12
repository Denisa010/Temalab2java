package utcluj.aut;

import java.util.Scanner;
import java.util.Random;

/**
 * Clasa MainExercitii include:
 * - Hello World cu add/subtract/multiply
 * - Suma primelor N numere pare
 * - Exercițiile 3-7
 * - Meniu interactiv
 */
public class MainExercitii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optiune;

        do {
            // Meniu
            System.out.println("\nAlege un exercițiu de rulat sau 0 pentru ieșire:");
            System.out.println("1 - Hello World + add/subtract/multiply");
            System.out.println("2 - Suma primelor N numere pare");
            System.out.println("3 - Suma cifrelor");
            System.out.println("4 - Triunghi Pascal");
            System.out.println("5 - Conversie baza 10 în 2-16");
            System.out.println("6 - Palindrom");
            System.out.println("7 - Ghicește numărul");
            System.out.print("Opțiunea ta: ");
            optiune = sc.nextInt();

            switch (optiune) {
                case 1:
                    helloExample(sc);
                    break;
                case 2:
                    System.out.print("Introdu N: ");
                    int n = sc.nextInt();
                    System.out.println("Suma primelor " + n + " numere pare: " + sumFirstNEvenNumbers(n));
                    break;
                case 3:
                    sumaCifrelor(sc);
                    break;
                case 4:
                    triunghiPascal(sc);
                    break;
                case 5:
                    conversieBaza(sc);
                    break;
                case 6:
                    palindrom(sc);
                    break;
                case 7:
                    ghicesteNumarul(sc);
                    break;
                case 0:
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Opțiune invalidă!");
            }

        } while (optiune != 0);
    }

    // ================= Hello World + add/subtract/multiply =================
    public static void helloExample(Scanner scanner) {
        System.out.println("Hello, World!");
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum is: " + add(a, b));
        System.out.println("Difference is: " + subtract(a, b));
        System.out.println("Multiplication is: " + multiply(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    // ================= Suma primelor N numere pare =================
    public static int sumFirstNEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }
        return sum;
    }

    // ================= Exercițiul 3: Suma cifrelor =================
    public static void sumaCifrelor(Scanner sc) {
        System.out.print("Introdu un număr pozitiv: ");
        int n = sc.nextInt();
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        System.out.println("Suma cifrelor este: " + suma);
    }

    // ================= Exercițiul 4: Triunghi Pascal =================
    public static void triunghiPascal(Scanner sc) {
        System.out.print("Introdu numărul de rânduri: ");
        int n = sc.nextInt();
        int[][] pascal = new int[n][n];
        for (int i = 0; i < n; i++) {
            pascal[i][0] = pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }
        System.out.println("Triunghiul lui Pascal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print(pascal[i][j] + " ");
            System.out.println();
        }
    }

    // ================= Exercițiul 5: Conversie baza 10 în 2-16 =================
    public static void conversieBaza(Scanner sc) {
        System.out.print("Introdu numărul în baza 10: ");
        int numar = sc.nextInt();
        System.out.print("Introdu baza (2-16): ");
        int baza = sc.nextInt();

        String cifre = "0123456789ABCDEF";
        String rezultat = "";
        if (numar == 0) rezultat = "0";
        while (numar > 0) {
            rezultat = cifre.charAt(numar % baza) + rezultat;
            numar /= baza;
        }
        System.out.println("Numărul convertit este: " + rezultat);
    }

    // ================= Exercițiul 6: Palindrom =================
    public static void palindrom(Scanner sc) {
        sc.nextLine(); // consumă enter-ul rămas
        System.out.print("Introdu un cuvânt: ");
        String text = sc.nextLine();
        String invers = "";
        for (int i = text.length() - 1; i >= 0; i--) invers += text.charAt(i);
        if (text.equals(invers)) System.out.println("Este palindrom");
        else System.out.println("Nu este palindrom");
    }

    // ================= Exercițiul 7: Ghicește numărul =================
    public static void ghicesteNumarul(Scanner sc) {
        Random random = new Random();
        int numar = random.nextInt(100) + 1;
        int incercare;
        System.out.println("Am ales un număr între 1 și 100.");
        do {
            System.out.print("Ghiceste numărul: ");
            incercare = sc.nextInt();
            if (incercare > numar) System.out.println("Prea mare!");
            else if (incercare < numar) System.out.println("Prea mic!");
        } while (incercare != numar);
        System.out.println("Felicitări! Ai ghicit numărul.");
    }
}