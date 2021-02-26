package View;

import javax.swing.GroupLayout;

import java.awt.BorderLayout;

import javax.swing.*;

public class FrageAntwort {
	JPanel jMainPanel = new JPanel();
	JPanel jPanel = new JPanel();
	JPanel jPanelAntwort = new JPanel();
	JPanel jPanelAntwortoben = new JPanel();	
	JPanel jPanelAntwortunten = new JPanel();
	ButtonListener buttonListener = new ButtonListener();	
	String frageText;
	String antwortText1;
	String antwortText2;
	String antwortText3;
	String antwortText4;
	
	
	public FrageAntwort(String frageText, String antwort1, String antwort2, String antwort3, String antwort4) {
		this.frageText = frageText;
	    this.antwortText1 = antwort1;	
	    this.antwortText2 = antwort2;	
	    this.antwortText3 = antwort3;	
	    this.antwortText4 = antwort4;	
	}
	public JPanel erstelleFrageAntwort() {
		
		JLabel frage = new JLabel(frageText);
		JButton antwort1 = new JButton(antwortText1);
		JButton antwort2 = new JButton(antwortText2);
		JButton antwort3 = new JButton(antwortText3);
		JButton antwort4 = new JButton(antwortText4);	
		buttonListener.getButtonHashMap().put("Antwort1", antwort1);
		antwort1.addActionListener(this.buttonListener);		
		buttonListener.getButtonHashMap().put("Antwort2", antwort2);
		antwort2.addActionListener(this.buttonListener);
		buttonListener.getButtonHashMap().put("Antwort3", antwort3);
		antwort3.addActionListener(this.buttonListener);
		buttonListener.getButtonHashMap().put("Antwort4", antwort4);
		antwort4.addActionListener(this.buttonListener);
		
		jPanelAntwortoben.add(antwort1, BorderLayout.LINE_START);
		jPanelAntwortoben.add(antwort2, BorderLayout.LINE_END);
		jPanelAntwortunten.add(antwort3, BorderLayout.LINE_START);
		jPanelAntwortunten.add(antwort4, BorderLayout.LINE_END);
		jPanelAntwort.add(jPanelAntwortoben, BorderLayout.PAGE_START);
		jPanelAntwort.add(jPanelAntwortunten, BorderLayout.PAGE_END);
		
		jPanel.add(frage, BorderLayout.NORTH);
		jPanel.add(jPanelAntwort, BorderLayout.SOUTH);
		jMainPanel.add(jPanel, BorderLayout.CENTER);
		return jMainPanel;
	}
}
