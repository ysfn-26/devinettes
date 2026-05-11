import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int essaisMax = 10;
        int essais = 0;
        boolean gagne = false;

        System.out.println(" Bienvenue dans le jeu de devinettes !");
        System.out.println("Devine un nombre entre 1 et 100. Tu as 10 essais.");

        // Boucle principale du jeu
        while (essais < essaisMax) {

            System.out.print("Essai " + (essais + 1) + " : ");
            int proposition = scanner.nextInt();
            essais++;

            // Comparaison
            if (proposition == nombreSecret) {
                System.out.println(" Bravo ! Tu as gagné !");
                gagne = true;
                break;
            } else if (proposition < nombreSecret) {
                System.out.println(" Trop petit !");
            } else {
                System.out.println(" Trop grand !");
            }
        }

        // Fin du jeu
        if (!gagne) {
            System.out.println(" Tu as perdu ! Le nombre était : " + nombreSecret);
        }

        scanner.close();
    }
}