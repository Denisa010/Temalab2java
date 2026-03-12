public class Exer2 {

    // Metodă care verifică dacă un număr este prim
    public static boolean estePrim(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Metodă care afișează toate numerele prime între 1 și 100
    public static void afiseazaPrime() {
        System.out.println("Numere prime între 1 și 100:");
        for (int i = 1; i <= 100; i++) {
            if (estePrim(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        afiseazaPrime();
    }
}
