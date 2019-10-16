import java.util.Scanner;

public class Wald {
	Scanner scanner = new Scanner(System.in);

	void startWald() {

		while (true) {
			auswahlWald();

		}
	}

	void auswahlWald() {
		System.out.println("Möchten Sie einen vermischten (v) und einen gleichartigen (g) Wald?\nFür Abbruch (a) drücken");
		String auswahl = scanner.next();
		if (auswahl.equalsIgnoreCase("v")) {

			heterogenerWald();

		}
		if (auswahl.equalsIgnoreCase("g")) {

			homogenerWald();
		}
		if (auswahl.equalsIgnoreCase("a")){
			Auswahl uAuswahl = new Auswahl ();
			uAuswahl.start();
		}
	}

	void homogenerWald() {

		System.out.println("Möchten Sie eine Laub oder einen Nadelwald erstellen?");
		String auswahlWald = scanner.next();

		System.out.println("Bitte Geben Sie die X Koordinate ein");
		int posX = scanner.nextInt();
		System.out.println("Bitte Geben Sie die Y Koordinate ein");
		int posY = scanner.nextInt();

		System.out.println("Wieviele Baumreihen sollen entstehen?");
		int anzahlReihen = scanner.nextInt();
		System.out.println("Wieviele Baumspalten sollen entstehen?");
		int anzahlSpalten = scanner.nextInt();

		if (auswahlWald.equalsIgnoreCase("Nadel")) {
			for (int i = 0; i < anzahlReihen; i++) {

				for (int j = 0; j < anzahlSpalten; j++) {
					Baum baum = new Baum();
					baum.setStammPosX(posX + (i * 40));
					baum.setStammPosY(posY + (j * 45));
					baum.nKrone();
				}

			}
		}
		if (auswahlWald.equalsIgnoreCase("Laub")) {
			for (int i = 0; i < anzahlReihen; i++) {

				for (int j = 0; j < anzahlSpalten; j++) {
					Baum baum = new Baum();
					baum.setStammPosX(posX + (i * 40));
					baum.setStammPosY(posY + (j * 45));
					baum.lKrone();
				}

			}
		}
	}

	void heterogenerWald() {

		System.out.println("Möchten Sie einen geordneten(g) oder einen gemischten(m) Wald erstellen?");
		String auswahlWald = scanner.next();

		System.out.println("Bitte Geben Sie die X Koordinate ein");
		int posX = scanner.nextInt();
		System.out.println("Bitte Geben Sie die Y Koordinate ein");
		int posY = scanner.nextInt();

		System.out.println("Wieviele Baumreihen sollen entstehen?");
		int anzahlReihen = scanner.nextInt();
		System.out.println("Wieviele Baumspalten sollen entstehen?");
		int anzahlSpalten = scanner.nextInt();

		if (auswahlWald.equalsIgnoreCase("g")) {
			for (int i = 0; i < anzahlReihen; i++) {

				for (int j = 0; j < anzahlSpalten; j++) {
					Baum baum = new Baum();
					baum.setStammPosX(posX + (i * 40));
					baum.setStammPosY(posY + (j * 55));
					if (i % 2 == 0) {
						baum.lKrone();
					} else
						baum.nKrone();

				}
			}
		}
		if (auswahlWald.equalsIgnoreCase("m")) {
			for (int i = 0; i < anzahlReihen; i++) {

				for (int j = 0; j < anzahlSpalten; j++) {
					Baum baum = new Baum();
					baum.setStammPosX(posX + (i * 40));
					baum.setStammPosY(posY + (j * 55));
					if (i % 2 != 0 && j % 2 != 0 || i % 2 == 0 && j % 2 == 0) {
						baum.lKrone();

					} else {
						baum.nKrone();
					}
				}
			}
		}
	}
}
