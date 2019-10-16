import java.util.Scanner;

public class Baum {

	Scanner scanner = new Scanner(System.in);
	public static final int STAMM_DIMENSION = 16;
	public static final int KRONEN_BREITE = 40;
	public static final int KRONEN_HOEHE = 40;
	int stammPosY;
	int stammPosX;
	
	int getStammPosY() {
		return stammPosY;
	}

	void setStammPosY(int stammPosY) {
		this.stammPosY = stammPosY;
	}

	int getStammPosX() {
		return stammPosX;
	}

	void setStammPosX(int stammPosX) {
		this.stammPosX = stammPosX;
	}

	
	int kversetzungswertY = 12;
	int kversetzungswertX = 36;

	void startBaum() {

		while (true) {
			auswahlBaum();

		}
	}

	void auswahlBaum() {
		einlesen();
		System.out.println("Nadel(N) oder Laubbaum (L)");
		String baum = scanner.next();
		if (baum.equalsIgnoreCase("N")) {
			nKrone();
		}
		if (baum.equalsIgnoreCase("L")) {
			lKrone();
		}
		System.out.println("Für Abbruch 'A' sonst einen beliebigen Buchstaben drücken");
		String abbruch = scanner.next();
		if (abbruch.equalsIgnoreCase("A")) {
			Auswahl auswahl = new Auswahl ();
			auswahl.start();
			
		}
		else {
			return;
		}
	}

	void einlesen() {
		System.out.println("Bitte Geben Sie die X Koordinate ein");
		stammPosX = scanner.nextInt();
		System.out.println("Bitte Geben Sie die Y Koordinate ein");
		stammPosY = scanner.nextInt();
		
	}

	void stamm() {
		Square square = new Square(stammPosY, stammPosX, STAMM_DIMENSION, "brown");
		square.draw();
	}

	void lKrone() {
		Ellipse ellipse = new Ellipse(stammPosY - kversetzungswertY, stammPosX - kversetzungswertX, KRONEN_BREITE,
				KRONEN_HOEHE, "green");
		ellipse.draw();
		stamm();
	}

	void nKrone() {
		Triangle triangle = new Triangle(stammPosY - kversetzungswertY, stammPosX - kversetzungswertX, KRONEN_BREITE,
				KRONEN_HOEHE, "firGreen");
		triangle.draw();
		stamm();

	}

}
