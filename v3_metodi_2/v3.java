package v3_metodi_2;
import java.util.Scanner;
public class v3 {
	   public static void metodUspesh(double b) {
	        if (b >= 8.5) System.out.println("Odlican");
	        else if (b >= 7.5) System.out.println("Vrlo dobar");
	        else if (b >= 5.5) System.out.println("Dobar");
	        else if (b >= 3.5) System.out.println("Dovoljan");
	        else System.out.println("Nedovoljan");
	    }

	    public static void main(String[] args) {
	        Scanner t = new Scanner(System.in);

	        System.out.print("Bodovi 1-10: ");
	        double b = t.nextDouble();

	        System.out.print("Uspeh: ");
	        metodUspesh(b);
	    }
	}

