import java.util.Random;
import java.util.Scanner;

public class Bicycle {

	public static void main(String[] args) {
		Random random = new Random();

		String wort = "BICYCLE";
		char[] buchstaben = wort.toCharArray();

		int zufall;

		for (int i = 0; i < wort.length(); i++) {

			zufall = random.nextInt(wort.length());
			char tmp = buchstaben[i];
			buchstaben[i] = buchstaben[zufall];
			buchstaben[zufall] = tmp;
		}

		System.out.println(new String(buchstaben));

		Scanner eingabe = new Scanner(System.in);
		System.out.print("Dein Tipp: ");
		String tipp = eingabe.next();

		boolean check = tipp.equals(buchstaben);

		for (int i = 0; i < wort.length(); i++) {
			if (tipp.charAt(i) == wort.charAt(i)) {
				System.out.println((i+1) + "1. Buchstabe richtig!");
			} else {
				System.out.println((i+1) +"1. Buchstabe falsch!");
			}
		}
		/*
		 * boolean check = tipp.equals(buchstaben);
		 * 
		 * if (tipp.equals(buchstaben)) { System.out.println(check); } if
		 * (tipp.equals("BICYCLE")) { System.out.println("Richtig!"); } else {
		 * System.out.println("Versuchen Sie es erneut!"); }
		 */

		if (tipp.equals(buchstaben)) {
			System.out.println(check);
		}
		if (tipp.equals("BICYCLE")) {
			System.out.println("Richtig!");
		} else {
			System.out.println("Versuchen Sie es erneut!");
		}

	}
}