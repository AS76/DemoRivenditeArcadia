package it.arcadia.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rivendita {
	

public String nomeRivendita, nomeUtente, indirizzo, localita, numeroTelefono, email;
SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
Date oggi = new Date();

	
//Qui ho usato una regex per definire un pattern con cui validare o no la mail, quando gli passo la stringa email lui
//fa chiama il controllo e con un IF verifica la cosa altrimenti scrive che non � corretto. Altri comportamenti
//li guardo in seguito su cosa dovrebbe attuare nel caso fosse giusta oppure no.

	public void emailPattern (String email) {
		String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if (email.matches(emailPattern)) {
			System.out.println("Email valida");
			} else {
				System.out.println("La mail non � corretta...");
			}
}


	public String getNomeRivendita() {
		return nomeRivendita;
	}


	public void setNomeRivendita(String nomeRivendita) {
		this.nomeRivendita = nomeRivendita;
	}


	public String getNomeUtente() {
		return nomeUtente;
	}


	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public String getLocalita() {
		return localita;
	}


	public void setLocalita(String localita) {
		this.localita = localita;
	}


	public String getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public SimpleDateFormat getData() {
		return data;
	}


	public Date getOggi() {
		return oggi;
	}


	public void setOggi(Date oggi) {
		this.oggi = oggi;
	}

//Qui metto il costruttore della classe con cui richiamer� i metodi nel momento in cui li istanzio
	
	public Rivendita(String nomeRivendita, String nomeUtente, String indirizzo, String localita, String numeroTelefono,
			String email, Date oggi) {
		super();
		this.nomeRivendita = nomeRivendita;
		this.nomeUtente = nomeUtente;
		this.indirizzo = indirizzo;
		this.localita = localita;
		this.numeroTelefono = numeroTelefono;
		this.email = email;
		this.oggi = oggi;
	}


	public Rivendita() {
		// TODO Auto-generated constructor stub
	}}