/**
 * @author Andrea Sassi
 * @version 14/09/2016
 * @params Altezza Rampa
 * @params Lunghezza Rampa
 * 
 * Questo piccolo applicativo chiede l'utilizzo del
 * 
 */

import java.util.Scanner;

import it.arcadia.model.*;


public class DemoCalcolo {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Qui chiedo i dati della rivendita

		Rivendita rivenditore = new Rivendita();
		System.out.println("Inserire il nome della Rivendita: ");
		rivenditore.nomeRivendita = scanner.nextLine(); //"ssss"; 
		System.out.println(rivenditore.nomeRivendita);
		System.out.println("Inserire il nome utente: ");
		rivenditore.nomeUtente = scanner.nextLine(); //"ssss";  
		System.out.println("Inserire l'indirizzo: ");
		rivenditore.localita = scanner.nextLine(); //"ssss";
		System.out.println("Inserire il numero di telefono: ");
		rivenditore.numeroTelefono = scanner.nextLine(); //"ssss"; 
		rivenditore.getOggi();
		System.out.println("Inserire il numero di telefono: ");
		rivenditore.numeroTelefono = scanner.nextLine(); //"ssss";
		System.out.println("Inserire ora l'email: ");
		rivenditore.email = scanner.nextLine(); //"ssss"; 
		rivenditore.getData();
		System.out.println("Oggi e' il " + rivenditore.getOggi() + ", richiesta da: " + rivenditore.getNomeRivendita()
				+ ", utente: " + rivenditore.nomeUtente + ", indirizzo: " + rivenditore.getIndirizzo() + ",: "
				+ rivenditore.getLocalita() + ", numero telefono: " + rivenditore.getNumeroTelefono() + ", email: "
				+ rivenditore.getEmail());

		// Istanzio la classe gradino ed i suoi metodi
		Gradino gradino = new Gradino();
		// Setto l'altezza della scala
		System.out.println("Altezza della scala in cm: ");
		double altezzaScala = scanner.nextDouble(); //300.00;
		gradino.setAltezzaScala(altezzaScala);
		// Setto la lunghezza della scala
		System.out.println("Lunghezza della scala in cm: ");
		double lunghezzaScala = scanner.nextDouble(); //450.00;
		gradino.setLunghezzaScala(lunghezzaScala);

		// Richiedo inoltre lo spessore in cm della piastrella
		System.out.println("Spessore della piastrella in cm");
		double spessore = scanner.nextDouble(); //1.00;
		gradino.setSpessore(spessore);
		// Ritrovo il numero dei pioli richiesto;

		gradino.calcolaPioliScala();
		System.out.println("Il numero dei pioli dovrebbe essere di " + gradino.getNumeroPioli());

		// richiedo di scegliere tra uno dei tre modelli

		//invoco i metodi di calcolo
		gradino.calcolaPedata();
		gradino.calcolaAlzata();
		gradino.calcoloCostaRetta();
		gradino.calcolodoppiaElle();
		gradino.calcoloElleSingola();

		// richiedo di scegliere tra uno dei tre modelli
		System.out.println("Alzata in cm: " + gradino.getAlzata());
		System.out.println("Pedata in cm: " + gradino.getPedata());
		System.out.println(
				"Ora, immettere una scelta di tipologia di gradino: 1-Costa Retta; 2-Doppia Elle; 3 - Elle Singola. Immettere un numero tra 1 e 3.");
		int scelta = 0;
		scelta = scanner.nextInt();
		switch (scelta) {
		case 1:
			System.out.println("Il gradino dovrebbe avere " + gradino.getIngombroEsternoPedataCostaRetta()
					+ "cm  di pedata e come luce interna di " + gradino.getPedata());
			System.out.println("Inoltre la sua alzata complessiva di " + gradino.getAlzata()
					+ "cm e il suo listone diventa di " + gradino.getRisultatoAlzataFinaleCostaRetta());
			break;
		case 2:
			System.out.println("Il gradino dovrebbe avere " + gradino.getIngombroEsternoPedataDoppiaElle()
					+ "cm  di pedata e come luce interna di " + gradino.getPedata());
			System.out.println("Inoltre la sua alzata complessiva di " + gradino.getAlzata()
					+ "cm e il suo listone diventa di " + gradino.getRisultatoAlzataFinaleDoppiaElle());
			break;
		case 3:
			System.out.println("Il gradino dovrebbe avere " + gradino.getIngombroEsternoPedataGradiniElle()
					+ "cm  di pedata e come luce interna di " + gradino.getPedata());
			System.out.println("Inoltre la sua alzata complessiva di " + gradino.getAlzata()
					+ "cm e il suo listone diventa di " + gradino.getRisultatoAlzataFinaleGradiniElle());
			break;

		default:
			break;
		}
	}
}
