package Model;

public class Frage {
	private String frage;
	private String richtigeAntwort;
	private String[] falscheAntworten;
	
	public Frage(String pFrage, String pAntwort, String[] pFalscheAntworten) {
		frage= pFrage;
		richtigeAntwort= pAntwort;
		falscheAntworten=pFalscheAntworten;
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
		return falscheAntworten;
	}

	public void setFalscheAntworten(String[] falscheAntworten) {
		this.falscheAntworten = falscheAntworten;
	}
	
}
