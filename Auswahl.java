import java.util.Scanner;

public class Auswahl {
	Scanner scanner = new Scanner(System.in);

	void start() {
		while (true) {
			auswahl();
		}

	}

	void auswahl() {
		System.out.println(
				"F�r das erstellen eines Baumes oder mehrerer B�ume dr�cken Sie 'B'\nF�r das erstellen eines Waldes oder mehrerer W�lder dr�cken Sie 'W'\nF�r das erstellen einer H�tte oder mehrerer H�tten dr�cken Sie 'H'\nF�r das erstellen eines Schlosses oder mehrerer Schl�sser dr�cken Sie 'S'");
		String auswahl = scanner.next();
		if (auswahl.equalsIgnoreCase("b")) {
			Baum baum = new Baum ();
			baum.startBaum();

		}
		if (auswahl.equalsIgnoreCase("w")) {
			Wald wald = new Wald ();
			wald.startWald();

		}
		if (auswahl.equalsIgnoreCase("h")) {
			Hut hut = new Hut ();
			hut.einlesen();
			hut.tri();
			hut.squ();

		}
		if (auswahl.equalsIgnoreCase("h")) {

		}

	}

}
