package Model;

import View.MainWindow;

public class Spiel {
	int nummerFrage = 1;
	boolean jokerTelefon = true;
	boolean joker50 = true;
	boolean jokerPublikum = true;
	private static Spiel instance;
	
	public static Spiel getInstance() {
		if (Spiel.instance == null) {
			Spiel.instance = new Spiel();
		}
		return Spiel.instance;
	}
	
	public void restart() {
		this.jokerTelefon = true;
		this.joker50 = true;
		this.jokerPublikum = true;
		this.nummerFrage = 1;
	}
	public int getNummerFrage() {
		return nummerFrage;
	}

	public void setNummerFrage(int nummerFrage) {
		this.nummerFrage = nummerFrage;
	}

	public boolean isJokerTelefon() {
		return jokerTelefon;
	}

	public void setJokerTelefon(boolean jokerTelefon) {
		this.jokerTelefon = jokerTelefon;
	}

	public boolean isJoker50() {
		return joker50;
	}

	public void setJoker50(boolean joker50) {
		this.joker50 = joker50;
	}

	public boolean isJokerPublikum() {
		return jokerPublikum;
	}

	public void setJokerPublikum(boolean jokerPublikum) {
		this.jokerPublikum = jokerPublikum;
	}
}
