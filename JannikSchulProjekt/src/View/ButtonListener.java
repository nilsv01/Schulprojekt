package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import Controller.*;
import Model.*;
import View.*;

public class ButtonListener implements ActionListener{
	
	private static ButtonListener instance;
	
	private HashMap<String, JButton> buttonHashMap = new HashMap<>();
	private ArrayList<Object> inputArrayList = new ArrayList<>();
	String frage;
	String antwort1;
	String antwort2;
	String antwort3;
	String antwort4;
	String loesungText;
	boolean sieg = false;
	int loesungNum;
	
	
	public HashMap<String, JButton> getButtonHashMap() {
		return buttonHashMap;
	}
	
	public static ButtonListener getInstance() {
		if (ButtonListener.instance == null) {
			ButtonListener.instance = new ButtonListener();
		}
		return ButtonListener.instance;
	}
	public ArrayList<Object> getInputArrayList() {
		return this.inputArrayList;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == this.buttonHashMap.get("Start")) {
		     Spiel.getInstance().restart();
		     String[] parts = Controller.getInstance().randomBuchstabe(Controller.getInstance().random()).split(";");
		     System.out.println(parts[1]);
		     parts[0] = frage;
		     parts[1] = antwort1;
		     parts[2] = antwort2;
		     parts[3] = antwort3;
		     parts[4] = antwort4;
		     parts[5] = loesungText;
		     loesungNum = Integer.valueOf(loesungText);
		     
			 loesungNum = 1;
		     FrageAntwort frageAntwort = new FrageAntwort();
			 MainWindow.getInstance().ueberarbeiteMainWindow(
						frageAntwort.erstelleFrageAntwort(frage, antwort1, antwort2, antwort3, antwort4, loesungNum));
						/*"f","a","b","c","d",1*/
		}
		if (event.getSource() == this.buttonHashMap.get("ende")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort1")) {
		   if(loesungNum == 1) {
				Spiel.getInstance().setNummerFrage(Spiel.getInstance().getNummerFrage() + 1);
				if(Spiel.getInstance().getNummerFrage() != 16) {					 
				     String[] parts = Controller.getInstance().randomBuchstabe(Controller.getInstance().random()).split(";");
				     parts[0] = frage;
				     parts[1] = antwort1;
				     parts[2] = antwort2;
				     parts[3] = antwort3;
				     parts[4] = antwort4;
				     parts[5] = loesungText;
				     loesungNum = Integer.valueOf(loesungText);	
				FrageAntwort frageAntwort = new FrageAntwort();
				MainWindow.getInstance().ueberarbeiteMainWindow(						
						frageAntwort.erstelleFrageAntwort(frage, antwort1, antwort2, antwort3, antwort4, loesungNum));
				} else {
					sieg = true;
					Endscreen endscreen = new Endscreen();
					MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
				}
			} else {
				sieg = false;
				Endscreen endscreen = new Endscreen();
				MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
			}
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort2")) {			
			if(loesungNum == 2) {
				Spiel.getInstance().setNummerFrage(Spiel.getInstance().getNummerFrage() + 1);
				if(Spiel.getInstance().getNummerFrage() != 16) {					 
				     String[] parts = Controller.getInstance().randomBuchstabe(Controller.getInstance().random()).split(";");
				     parts[0] = frage;
				     parts[1] = antwort1;
				     parts[2] = antwort2;
				     parts[3] = antwort3;
				     parts[4] = antwort4;
				     parts[5] = loesungText;
				     loesungNum = Integer.valueOf(loesungText);		
				Spiel.getInstance().setNummerFrage(Spiel.getInstance().getNummerFrage() + 1);
				FrageAntwort frageAntwort = new FrageAntwort();
				MainWindow.getInstance().ueberarbeiteMainWindow(
						frageAntwort.erstelleFrageAntwort(frage, antwort1, antwort2, antwort3, antwort4, loesungNum));
				} else {
					sieg = true;
					Endscreen endscreen = new Endscreen();
					MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
				}
			} else {
				sieg = false;
				Endscreen endscreen = new Endscreen();
				MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
			}
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort3")) {			
			if(loesungNum == 3) {
				Spiel.getInstance().setNummerFrage(Spiel.getInstance().getNummerFrage() + 1);
				if(Spiel.getInstance().getNummerFrage() != 16) {					 
				     String[] parts = Controller.getInstance().randomBuchstabe(Controller.getInstance().random()).split(";");
				     parts[0] = frage;
				     parts[1] = antwort1;
				     parts[2] = antwort2;
				     parts[3] = antwort3;
				     parts[4] = antwort4;
				     parts[5] = loesungText;
				     loesungNum = Integer.valueOf(loesungText);	
				FrageAntwort frageAntwort = new FrageAntwort();
				MainWindow.getInstance().ueberarbeiteMainWindow(
						frageAntwort.erstelleFrageAntwort(frage, antwort1, antwort2, antwort3, antwort4, loesungNum));
				} else {
					sieg = true;
					Endscreen endscreen = new Endscreen();
					MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
				}
			} else {
				sieg = false;
				Endscreen endscreen = new Endscreen();
				MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
			}
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort4")) {
			if(loesungNum == 4) {
				Spiel.getInstance().setNummerFrage(Spiel.getInstance().getNummerFrage() + 1);
				if(Spiel.getInstance().getNummerFrage() != 16) {					 
				     String[] parts = Controller.getInstance().randomBuchstabe(Controller.getInstance().random()).split(";");
				     parts[0] = frage;
				     parts[1] = antwort1;
				     parts[2] = antwort2;
				     parts[3] = antwort3;
				     parts[4] = antwort4;
				     parts[5] = loesungText;
				     loesungNum = Integer.valueOf(loesungText);	
				FrageAntwort frageAntwort = new FrageAntwort();
				MainWindow.getInstance().ueberarbeiteMainWindow(
						frageAntwort.erstelleFrageAntwort(frage, antwort1, antwort2, antwort3, antwort4, loesungNum));
				} else {
					sieg = true;
					Endscreen endscreen = new Endscreen();
					MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
				}
			} else {
				sieg = false;
				Endscreen endscreen = new Endscreen();
				MainWindow.getInstance().ueberarbeiteMainWindow(endscreen.erstelleEndscreen(sieg));
			}
		}
		if (event.getSource() == this.buttonHashMap.get("jokerTelefon")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("joker50")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("jokerPublikum")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("Finish")) {
			 StartMenu startMenu = new StartMenu();
		     MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
	}
}
