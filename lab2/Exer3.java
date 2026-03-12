
import java.util.Scanner;

public class Exer3.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu un număr pozitiv: ");
        int n = sc.nextInt();
        int suma = 0;

        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }

        System.out.println("Suma cifrelor este: " + suma);
    }
}