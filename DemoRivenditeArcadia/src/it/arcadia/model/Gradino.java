package it.arcadia.model;

public class Gradino {

	// variabili in ingresso quando uno deve definire il conteggio dei pioli di
	// una scala
	private double lunghezzaScala;
	private double altezzaScala;
	private int numeroPioli;
	
	// rapporto con il quale viene spiegato il risultato della riga successiva
	// numero costante sul quale � bene non uscire dallo schema
	// l'espressione esatta � rapportoPedataAlzata = pedata + (alzata * 2)
	private final int rapporto = 63;

	private double pedata, alzata, spessore;
	private double ingombroEsternoPedataCostaRetta;
	private double risultatoAlzataFinaleCostaRetta;

	private double ingombroEsternoPedataDoppiaElle;
	private double risultatoAlzataFinaleDoppiaElle;

	private double ingombroEsternoPedataGradiniElle;
	private double risultatoAlzataFinaleGradiniElle;
	
	
	public Gradino(double lunghezzaScala, double altezzaScala, int numeroPioli, double pedata, double alzata,
			double spessore, double ingombroEsternoPedataCostaRetta, double risultatoAlzataFinaleCostaRetta,
			double ingombroEsternoPedataDoppiaElle, double risultatoAlzataFinaleDoppiaElle,
			double ingombroEsternoPedataGradiniElle, double risultatoAlzataFinaleGradiniElle) {
		this.lunghezzaScala = lunghezzaScala;
		this.altezzaScala = altezzaScala;
		this.numeroPioli = numeroPioli;
		this.pedata = pedata;
		this.alzata = alzata;
		this.spessore = spessore;
		this.ingombroEsternoPedataCostaRetta = ingombroEsternoPedataCostaRetta;
		this.risultatoAlzataFinaleCostaRetta = risultatoAlzataFinaleCostaRetta;
		this.ingombroEsternoPedataDoppiaElle = ingombroEsternoPedataDoppiaElle;
		this.risultatoAlzataFinaleDoppiaElle = risultatoAlzataFinaleDoppiaElle;
		this.ingombroEsternoPedataGradiniElle = ingombroEsternoPedataGradiniElle;
		this.risultatoAlzataFinaleGradiniElle = risultatoAlzataFinaleGradiniElle;
	}

	
	public Gradino() {
		// TODO Auto-generated constructor stub
	}
	
/*da implementare in seguito
	
	public void verificaMisureInterneGradinoRapporto() {
		// verifico che ci sia una condizione idonea per il rapporto scala

		double rapportoPedataAlzata = pedata + alzata * 2;
		if (rapportoPedataAlzata <= 62) {
			System.out.println("il rapporto � sbagliato (troppo basso), correggere gli input");
		} else if (rapportoPedataAlzata >= 64) {
			System.out.println("il rapporto � sbagliato (troppo alto), correggere gli input");
		}
	}

	public void verificaMisureInterneGradinoAlzata() {
		// verifico che ci sia una condizione idonea per il valore
		// dell'alzata interna

		double alzata = 0;
		if (alzata <= 16) {
			System.out.println("il valore è sbagliato (troppo basso).");
		} else if (alzata >= 18) {
			System.out.println("il valore è sbagliato (troppo alto).");
		}
	}

	public void verificaMisureInterneGradinoPedata() {
		// verifico che ci sia una condizione idonea per il valore della pedata
		// interna

		double pedata = 0;
		if (pedata <= 30) {
			System.out.println("il valore è sbagliato (troppo basso).");
		} else if (pedata >= 33) {
			System.out.println("il valore è sbagliato (troppo alto).");
		}
	}*/

	public double getLunghezzaScala() {
		return lunghezzaScala;
	}


	public void setLunghezzaScala(double lunghezzaScala) {
		this.lunghezzaScala = lunghezzaScala;
	}


	public double getAltezzaScala() {
		return altezzaScala;
	}


	public void setAltezzaScala(double altezzaScala) {
		this.altezzaScala = altezzaScala;
	}


	public int getNumeroPioli() {
		return numeroPioli;
	}


	public void setNumeroPioli(int numeroPioli) {
		this.numeroPioli = numeroPioli;
	}


	public double getPedata() {
		return pedata;
	}


	public void setPedata(double pedata) {
		this.pedata = pedata;
	}


	public double getAlzata() {
		return alzata;
	}


	public void setAlzata(double alzata) {
		this.alzata = alzata;
	}


	public double getSpessore() {
		return spessore;
	}


	public void setSpessore(double spessore) {
		this.spessore = spessore;
	}


	public double getIngombroEsternoPedataCostaRetta() {
		return ingombroEsternoPedataCostaRetta;
	}


	public void setIngombroEsternoPedataCostaRetta(double ingombroEsternoPedataCostaRetta) {
		this.ingombroEsternoPedataCostaRetta = ingombroEsternoPedataCostaRetta;
	}


	public double getRisultatoAlzataFinaleCostaRetta() {
		return risultatoAlzataFinaleCostaRetta;
	}


	public void setRisultatoAlzataFinaleCostaRetta(double risultatoAlzataFinaleCostaRetta) {
		this.risultatoAlzataFinaleCostaRetta = risultatoAlzataFinaleCostaRetta;
	}


	public double getIngombroEsternoPedataDoppiaElle() {
		return ingombroEsternoPedataDoppiaElle;
	}


	public void setIngombroEsternoPedataDoppiaElle(double ingombroEsternoPedataDoppiaElle) {
		this.ingombroEsternoPedataDoppiaElle = ingombroEsternoPedataDoppiaElle;
	}


	public double getRisultatoAlzataFinaleDoppiaElle() {
		return risultatoAlzataFinaleDoppiaElle;
	}


	public void setRisultatoAlzataFinaleDoppiaElle(double risultatoAlzataFinaleDoppiaElle) {
		this.risultatoAlzataFinaleDoppiaElle = risultatoAlzataFinaleDoppiaElle;
	}


	public double getIngombroEsternoPedataGradiniElle() {
		return ingombroEsternoPedataGradiniElle;
	}


	public void setIngombroEsternoPedataGradiniElle(double ingombroEsternoPedataGradiniElle) {
		this.ingombroEsternoPedataGradiniElle = ingombroEsternoPedataGradiniElle;
	}


	public double getRisultatoAlzataFinaleGradiniElle() {
		return risultatoAlzataFinaleGradiniElle;
	}


	public void setRisultatoAlzataFinaleGradiniElle(double risultatoAlzataFinaleGradiniElle) {
		this.risultatoAlzataFinaleGradiniElle = risultatoAlzataFinaleGradiniElle;
	}


	public int getRapporto() {
		return rapporto;
	}


	public void calcolaPioliScala() {

		this.numeroPioli = (int) (altezzaScala / (rapporto / 4));
	}
	
	public void calcolaAlzata(){
		alzata = altezzaScala / numeroPioli;
	}
	
	public void calcolaPedata(){
		pedata = lunghezzaScala / numeroPioli;
	}
	
	public void calcoloCostaRetta() {

		this.ingombroEsternoPedataCostaRetta = pedata + 4;
		this.risultatoAlzataFinaleCostaRetta = alzata - 4;

	}

	public void calcolodoppiaElle() {

		this.ingombroEsternoPedataDoppiaElle = pedata + ((spessore * 2) + 0.2);
		this.risultatoAlzataFinaleDoppiaElle = alzata - 4 + spessore;

	}

	public void calcoloElleSingola() {

		this.ingombroEsternoPedataGradiniElle = pedata + spessore;
		this.risultatoAlzataFinaleGradiniElle = alzata - 4 + spessore;

	}	

}