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
	FrageAntwort frageAntwort;
	
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
		     frageAntwort = new FrageAntwort();
			 MainWindow.getInstance().ueberarbeiteMainWindow(
						frageAntwort.erstelleFrageAntwort("f","a1","a2","a3","a4",3));
		}
		if (event.getSource() == this.buttonHashMap.get("ende")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort1")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort2")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort3")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
		}
		if (event.getSource() == this.buttonHashMap.get("Antwort4")) {
		     StartMenu startMenu = new StartMenu();
			 MainWindow.getInstance().ueberarbeiteMainWindow(startMenu.erstelleStartMenu());
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
	}
}
