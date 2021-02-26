package Model;

public class Frage {
	
	private String frage;
	private String richtigeAntwort;
	private String[] falscheAntwort;
	private boolean status = false;
	
	public Frage(String pFrage, String[] pFalsch,String pRichtig) {
		frage = pFrage;
		richtigeAntwort = pRichtig;
		falscheAntwort = pFalsch;
		
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

	public String[] getFalscheAntwort() {
		return falscheAntwort;
	}

	public void setFalscheAntwort(String[] falscheAntwort) {
		this.falscheAntwort = falscheAntwort;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
