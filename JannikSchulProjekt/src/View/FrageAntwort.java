package View;

import javax.swing.GroupLayout;

import java.awt.*;

import javax.swing.*;

public class FrageAntwort {
	JPanel jMainPanel = new JPanel();
	JPanel jPanel = new JPanel();
	JPanel jPanelUnten = new JPanel();
	JPanel jPanelFrage = new JPanel();
	JPanel jPanelAntwortoben = new JPanel();	
	JPanel jPanelAntwortunten = new JPanel();
	JPanel jPanelJoker	= new JPanel();
	JPanel jPanelGeld = new JPanel();
	JPanel jPanelKopf = new JPanel();
	JPanel jPanelMitte = new JPanel();
	ButtonListener buttonListener = new ButtonListener();	
	String frageText;
	String antwortText1;
	String antwortText2;
	String antwortText3;
	String antwortText4;
	
	int loesung;
	
	
	public FrageAntwort(String frageText, String antwort1, String antwort2, String antwort3, String antwort4, int loesung) {
		this.frageText = frageText;
	    this.antwortText1 = antwort1;	
	    this.antwortText2 = antwort2;	
	    this.antwortText3 = antwort3;	
	    this.antwortText4 = antwort4;
	    this.loesung = loesung;
	   
	}
	public JPanel erstelleFrageAntwort() {
		
		JLabel frage = new JLabel(frageText);
		JButton antwort1 = new JButton(antwortText1);
		JButton antwort2 = new JButton(antwortText2);
		JButton antwort3 = new JButton(antwortText3);
		JButton antwort4 = new JButton(antwortText4);
		JButton jokerTelefon = new JButton("Telefonjoker");
		JButton joker50 = new JButton("50 / 50 Joker");
		JButton jokerPublikum = new JButton("Publikumsjoker");
		
		buttonListener.getButtonHashMap().put("Antwort1", antwort1);
		antwort1.addActionListener(this.buttonListener);		
		antwort1.setPreferredSize(new Dimension(500,50));
		buttonListener.getButtonHashMap().put("Antwort2", antwort2);
		antwort2.addActionListener(this.buttonListener);
		antwort2.setPreferredSize(new Dimension(500,50));
		buttonListener.getButtonHashMap().put("Antwort3", antwort3);
		antwort3.addActionListener(this.buttonListener);
		antwort3.setPreferredSize(new Dimension(500,50));
		buttonListener.getButtonHashMap().put("Antwort4", antwort4);
		antwort4.addActionListener(this.buttonListener);
		antwort4.setPreferredSize(new Dimension(500,50));		
		
		buttonListener.getButtonHashMap().put("jokerTelefon", jokerTelefon);
		jokerTelefon.addActionListener(this.buttonListener);
		jokerTelefon.setPreferredSize(new Dimension(500,50));	
		buttonListener.getButtonHashMap().put("joker50", joker50);
		joker50.addActionListener(this.buttonListener);
		joker50.setPreferredSize(new Dimension(500,50));	
		buttonListener.getButtonHashMap().put("jokerPublikum", jokerPublikum);
		jokerPublikum.addActionListener(this.buttonListener);
		jokerPublikum.setPreferredSize(new Dimension(500,50));	
		
		jPanelAntwortoben.add(antwort1, BorderLayout.LINE_START);
		jPanelAntwortoben.add(antwort2, BorderLayout.LINE_END);
		jPanelAntwortunten.add(antwort3, BorderLayout.LINE_START);
		jPanelAntwortunten.add(antwort4, BorderLayout.LINE_END);
		jPanelFrage.add(frage,BorderLayout.CENTER);
		/*	jPanelAntwort.add(jPanelAntwortoben, BorderLayout.PAGE_START);
		jPanelAntwort.add(jPanelAntwortunten, BorderLayout.PAGE_END); */
		
		GroupLayout layoutUnten = new GroupLayout(jPanelUnten);
		layoutUnten.setAutoCreateGaps(true);
		layoutUnten.setAutoCreateContainerGaps(true);
		layoutUnten.setHorizontalGroup(layoutUnten.createSequentialGroup()
				.addGroup(layoutUnten.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jPanelFrage)
						.addComponent(jPanelAntwortoben)
						.addComponent(jPanelAntwortunten)));
		layoutUnten.setVerticalGroup(layoutUnten.createSequentialGroup()
				.addGroup(layoutUnten.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jPanelFrage))
				.addGroup(layoutUnten.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jPanelAntwortoben))
				.addGroup(layoutUnten.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jPanelAntwortunten)));
		jPanelUnten.setLayout(layoutUnten);
	/*	jPanel.add(frage, BorderLayout.NORTH);
		jPanel.add(jPanelAntwort, BorderLayout.SOUTH);*/
		
		
		GroupLayout layoutJoker = new GroupLayout(jPanelJoker);
		layoutJoker.setAutoCreateGaps(true);
		layoutJoker.setAutoCreateContainerGaps(true);
		layoutJoker.setHorizontalGroup(layoutJoker.createSequentialGroup()
				.addGroup(layoutJoker.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jokerTelefon)
						.addComponent(joker50)
						.addComponent(jokerPublikum)));
		layoutJoker.setVerticalGroup(layoutJoker.createSequentialGroup()
				.addGroup(layoutJoker.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jokerTelefon))
				.addGroup(layoutJoker.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(joker50))
				.addGroup(layoutJoker.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jokerPublikum)));
		jPanelJoker.setLayout(layoutJoker);
		
		GroupLayout layoutMitte = new GroupLayout(jPanelMitte);
		layoutMitte.setAutoCreateGaps(true);
		layoutMitte.setAutoCreateContainerGaps(true);
		layoutMitte.setHorizontalGroup(layoutMitte.createSequentialGroup()
				.addGroup(layoutMitte.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanelJoker))
				.addGroup(layoutMitte.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanelGeld)));
		layoutMitte.setVerticalGroup(layoutMitte.createSequentialGroup()
				.addGroup(layoutMitte.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jPanelJoker)
						.addComponent(jPanelGeld)));
		jPanelMitte.setLayout(layoutMitte);
		
		jMainPanel.add(jPanelKopf, BorderLayout.PAGE_START);
		jMainPanel.add(jPanelMitte, BorderLayout.CENTER);
		jMainPanel.add(jPanelUnten, BorderLayout.PAGE_END);
		
		jMainPanel.setPreferredSize(new Dimension(1200,1000));
		jPanel.add(jMainPanel);
		return jPanel;
	}
}
