import java.util.Scanner;

public class Baum {

	Scanner scanner = new Scanner(System.in);

	int stammDimension = 16;
	int stammPosX;
	int stammPosY;
	int laubKroneBreite = 40;
	int laubKroneHoehe = 40;
	
	void start () {
		
		while (true) {
			einlesen();
			
		}
	}
	
	
	void einlesen() {
		System.out.println("Bitte Geben Sie die Y Koordinate ein");
		stammPosY = scanner.nextInt();
		System.out.println("Bitte Geben Sie die X Koordinate ein");
		stammPosX = scanner.nextInt();
	}


	void stamm() {
		Square square = new Square(stammPosX, stammPosY, stammDimension, "brown");
		square.draw();
	}
	
	void auswahl () {
		System.out.println("Nadel(N) oder Laubbaum (L)");
		String baum = scanner.next();
		if (baum.equalsIgnoreCase("N")) {
			nKrone();
		}
		if (baum.equalsIgnoreCase("L")) {
			lkrone();
		}
	}

	void lkrone() {
		Ellipse ellipse = new Ellipse(stammPosX-12, stammPosY-36, laubKroneBreite, laubKroneHoehe, "green");
		ellipse.draw();
	}
	
	void nKrone () {
		Triangle triangle = new Triangle (stammPosX-12, stammPosY-36, laubKroneBreite, laubKroneHoehe, "firGreen");
		triangle.draw();
	}

}
