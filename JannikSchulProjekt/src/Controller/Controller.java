package Controller;
import Model.*;
public class Controller {
	private static Controller instance;
	
	public static Controller getInstance() {
		if (Controller.instance == null) {
			Controller.instance = new Controller();			
		}
		return Controller.instance;
	}
	
	public Frage random(){
	    Frage akt;
	    int Fragenanzahl=ReadFromFile.readFragen("Fragenkatalog").size();
	    int zufallszahl =(int)(Math.random()*Fragenanzahl)+1;    
	    akt=ReadFromFile.readFragen("Fragenkatalog").get(zufallszahl);
	    akt.setStatus(true);
	    
	    return akt;
	  }
	
	 public String randomBuchstabe(Frage aktuelleFrage) {
		 int indexFalsch1= (int)(Math.random()*4)+1;
		 int indexFalsch2= (int)(Math.random()*4)+1;
		 int indexFalsch3= (int)(Math.random()*4)+1;
		 int indexRichtig= (int)(Math.random()*4)+1;
		 while(indexFalsch2==indexFalsch1){
			 indexFalsch2= (int)(Math.random()*3);
		 }
		 while(indexFalsch3==indexFalsch1||indexFalsch3==indexFalsch2) {
			 indexFalsch3= (int)(Math.random()*4)+1;
		 }
		 indexRichtig=10-indexFalsch1-indexFalsch2-indexFalsch3;
		 return indexFalsch1+""+indexFalsch2+""+indexFalsch3+""+indexRichtig;
	}
	
	
	
	public void fitftyfifty(Frage aktuelleFrage){
	    int indexFalscheFrage1= (int)(Math.random()*3);
	    int indexFalscheFrage2= (int)(Math.random()*3);
	    while(indexFalscheFrage2==indexFalscheFrage1){
	      indexFalscheFrage2= (int)(Math.random()*3);
	    }
	    aktuelleFrage.setFalscheAntwortPos(indexFalscheFrage1,"");
	    aktuelleFrage.setFalscheAntwortPos(indexFalscheFrage2,"");
	  }
	
}
