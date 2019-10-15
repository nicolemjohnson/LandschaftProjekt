import java.util.Scanner;

public class Baum {

	Scanner scanner = new Scanner(System.in);
 // public static final (Datentyp) NAME = wert;
	int stammDimension = 16;
	int stammPosY;
	int stammPosX;
	int kronenBreite = 40;
	int kronenHoehe = 40;
	int kversetzungswertY = 12;
	int kversetzungswertX = 36;

	void start() {

		while (true) {
			auswahl();

		}
	}

	void auswahl() {
		einlesen();
		System.out.println("Nadel(N) oder Laubbaum (L)");
		String baum = scanner.next();
		if (baum.equalsIgnoreCase("N")) {
			nKrone();
		}
		if (baum.equalsIgnoreCase("L")) {
			lkrone();
		}
		stamm();
	}

	void einlesen() {
		System.out.println("Bitte Geben Sie die X Koordinate ein");
		stammPosX = scanner.nextInt();
		System.out.println("Bitte Geben Sie die Y Koordinate ein");
		stammPosY = scanner.nextInt();
	}

	void stamm() {
		Square square = new Square(stammPosY, stammPosX, stammDimension, "brown");
		square.draw();
	}

	void lkrone() {
		Ellipse ellipse = new Ellipse(stammPosY - kversetzungswertY, stammPosX - kversetzungswertX, kronenBreite,
				kronenHoehe, "green");
		ellipse.draw();
	}

	void nKrone() {
		Triangle triangle = new Triangle(stammPosY - kversetzungswertY, stammPosX - kversetzungswertX, kronenBreite,
				kronenHoehe, "firGreen");
		triangle.draw();
	}

}
