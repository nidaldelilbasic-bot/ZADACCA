package kolokvijum1_zadaci;
import java.util.Scanner;
public class Kamata {
	public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Kamatna stopa (%): ");
        double kamata = t.nextDouble() / 100;

        System.out.print("Pocetan depozit: ");
        double depozit = t.nextDouble();

        double kamataIznos = depozit * kamata;
        double total = depozit + kamataIznos;

        System.out.println("Kamatni iznos e: " + kamataIznos + " den.");
        System.out.println("ukupno: " + total + " den.");
    }
}

