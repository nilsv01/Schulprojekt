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
	private HashMap<String, JButton> buttonHashMap = new HashMap<>();
	private ArrayList<Object> inputArrayList = new ArrayList<>();
	
	public HashMap<String, JButton> getButtonHashMap() {
		return buttonHashMap;
	}

	public ArrayList<Object> getInputArrayList() {
		return this.inputArrayList;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == this.buttonHashMap.get("Start")) {
			 FrageAntwort frageAntwort = new FrageAntwort("f","a1","a2","a3","a4",3);
			 MainWindow.getInstance().ueberarbeiteMainWindow(
						frageAntwort.erstelleFrageAntwort());
		}
	}
}
