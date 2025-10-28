package razlomcii;

import java.util.Scanner;

public class razlomcii {

	public static void main(String[] args) {

		int brojnik, nazivnik, b1, n1;
		Scanner tastatura = new Scanner(System.in);

		System.out.print("Unesite brojnik: ");
		brojnik = tastatura.nextInt();

		System.out.print("Unesite nazivnik: ");
		nazivnik = tastatura.nextInt();

		b1 = brojnik;
		n1 = nazivnik;

		while (brojnik != nazivnik) {
			if (brojnik > nazivnik) {
				brojnik = brojnik - nazivnik;
			} else {
				nazivnik = nazivnik - brojnik;
			}
		}

		int nzd = brojnik;

		System.out.println("Najveci zajednicki djelilac je: " + nzd);
		System.out.println("Skraceni razlomak je: " + (b1 / nzd) + "/"
				+ (n1 / nzd));

	}
}
