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
				"Für das erstellen eines Baumes oder mehrerer Bäume drücken Sie 'B'\nFür das erstellen eines Waldes oder mehrerer Wälder drücken Sie 'W'\nFür das erstellen einer Hütte oder mehrerer Hütten drücken Sie 'H'\nFür das erstellen eines Schlosses oder mehrerer Schlösser drücken Sie 'S'");
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
