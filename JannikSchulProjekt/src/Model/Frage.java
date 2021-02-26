package Model;

public class Frage {
	private String frage;
	private String richtigeAntwort;
	private String[] falscheAntwort;
	
	public Frage(String pFrage, String[] pFalsch,String pRichtig) {
		frage= pFrage;
		richtigeAntwort= pRichtig;
		falscheAntwort=pFalsch;
	}

	public String getFrage() {
		return frage;
	}

	public void setFrage(String frage) {
		this.frage = frage;
	}

	public String getRichtigeAntwort() {
		return richtigeAntwort;
	}

	public void setRichtigeAntwort(String richtigeAntwort) {
		this.richtigeAntwort = richtigeAntwort;
	}

	public String[] getFalscheAntworten() {
		return falscheAntwort;
	}

	public void setFalscheAntworten(String[] falscheAntworten) {
		this.falscheAntwort = falscheAntworten;
	}
	
}
