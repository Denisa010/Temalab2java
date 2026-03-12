import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu un cuvant: ");
        String text = sc.nextLine();

        String invers = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            invers = invers + text.charAt(i);
        }

        if (text.equals(invers)) {
            System.out.println("Este palindrom");
        } else {
            System.out.println("Nu este palindrom");
        }
    }
}