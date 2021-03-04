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
		 int falsch1= (int)(Math.random()*4)+1;
		 int falsch2= (int)(Math.random()*4)+1;
		 int falsch3= (int)(Math.random()*4)+1;
		 int richtig;
		 String index1="";
		 String index2="";
		 String index3="";
		 String index4="";
		 while(falsch2==falsch1){
			 falsch2= (int)(Math.random()*3);
		 }
		 while(falsch3==falsch1||falsch3==falsch2) {
			falsch3= (int)(Math.random()*4)+1;
		 }
		richtig=10-falsch1-falsch2-falsch3;
		 
		 switch(falsch1) {
		 	case 1:
		 		index1=aktuelleFrage.getFalscheAntwort(0);
		 		break;
		 	case 2:
		 		index2=aktuelleFrage.getFalscheAntwort(0);
		 		break;
		 	case 3:
		 		index3=aktuelleFrage.getFalscheAntwort(0);
		 		break;
		 	case 4:
		 		index4=aktuelleFrage.getFalscheAntwort(0);
		 }
		 switch(falsch2) {
		 	case 1:
		 		index1=aktuelleFrage.getFalscheAntwort(1);
		 		break;
		 	case 2:
		 		index2=aktuelleFrage.getFalscheAntwort(1);
		 		break;
		 	case 3:
		 		index3=aktuelleFrage.getFalscheAntwort(1);
		 		break;
		 	case 4:
		 		index4=aktuelleFrage.getFalscheAntwort(1);
		
		
		 }
		 switch(falsch3) {
		 	case 1:
		 		index1=aktuelleFrage.getFalscheAntwort(2);
		 		break;
		 	case 2:
		 		index2=aktuelleFrage.getFalscheAntwort(2);
		 		break;
		 	case 3:
		 		index3=aktuelleFrage.getFalscheAntwort(2);
		 		break;
		 	case 4:
		 		index4=aktuelleFrage.getFalscheAntwort(2);
		
		
		 }
		 switch(richtig) {
		 	case 1:
		 		index1=aktuelleFrage.getRichtigeAntwort();
		 		break;
		 	case 2:
		 		index2=aktuelleFrage.getRichtigeAntwort();
		 		break;
		 	case 3:
		 		index3=aktuelleFrage.getRichtigeAntwort();
		 		break;
		 	case 4:
		 		index4=aktuelleFrage.getRichtigeAntwort();
		
		
		 }
		 return index1+";"+index1+";"+index1+";"+index1+";"+richtig;
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
