import java.util.Scanner;
import java.util.Random;

public class Exer7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numar = random.nextInt(100) + 1; // numar intre 1 si 100
        int incercare;

        System.out.println("Am ales un numar intre 1 si 100.");

        do {
            System.out.print("Ghiceste numarul: ");
            incercare = sc.nextInt();

            if (incercare > numar) {
                System.out.println("Prea mare!");
            } else if (incercare < numar) {
                System.out.println("Prea mic!");
            }

        } while (incercare != numar);

        System.out.println("Felicitari! Ai ghicit numarul.");
    }
}