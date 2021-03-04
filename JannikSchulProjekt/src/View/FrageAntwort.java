package View;

import javax.swing.GroupLayout;

import Model.Spiel;

import java.awt.*;

import javax.swing.*;

public class FrageAntwort {
	
	ButtonListener buttonListener = ButtonListener.getInstance();
	
	int loesung;
	
	String frageText;
	String antwortText1;
	String antwortText2;
	String antwortText3;
	String antwortText4;

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
	
	JLabel blank   = new JLabel(" ");
	
    JLabel frage1  = new JLabel(" 1 - € 50");
    JLabel frage2  = new JLabel(" 2 - € 100");
    JLabel frage3  = new JLabel(" 3 - € 200");
    JLabel frage4  = new JLabel(" 4 - € 300");
    JLabel frage5  = new JLabel(" 5 - € 500");
    JLabel frage6  = new JLabel(" 6 - € 1.000");
    JLabel frage7  = new JLabel(" 7 - € 2.000");
    JLabel frage8  = new JLabel(" 8 - € 4.000");
    JLabel frage9  = new JLabel(" 9 - € 8.000");
    JLabel frage10 = new JLabel("10 - € 16.000");
    JLabel frage11 = new JLabel("11 - € 32.000");
    JLabel frage12 = new JLabel("12 - € 64.000");
    JLabel frage13 = new JLabel("13 - € 125.000");
    JLabel frage14 = new JLabel("14 - € 500.000");
    JLabel frage15 = new JLabel("15 - € 1MILLION"); 
   	
	JButton jokerTelefon = new JButton("Telefonjoker");
	JButton joker50 = new JButton("50 / 50 Joker");
	JButton jokerPublikum = new JButton("Publikumsjoker");
	JButton jButtonEnde = new JButton("Spiel beenden");	
	
	JLabel frage;
	JButton antwort1;
	JButton antwort2;
	JButton antwort3;
	JButton antwort4;
	
	public FrageAntwort() {
		
	   
	}
	
	public JPanel erstelleFrageAntwort(String frageText, String antwortText1, String antwortText2, String antwortText3, String antwortText4, int loesung) {
		
		this.frageText = frageText;
	    this.antwortText1 = antwortText1;	
	    this.antwortText2 = antwortText2;	
	    this.antwortText3 = antwortText3;	
	    this.antwortText4 = antwortText4;
	    this.loesung = loesung;
	    
		this.frage = new JLabel(frageText);
		this.antwort1 = new JButton(antwortText1);
		this.antwort2 = new JButton(antwortText2);
		this.antwort3 = new JButton(antwortText3);
		this.antwort4 = new JButton(antwortText4);
			
		blank.setPreferredSize(new Dimension(700,10));
		blank.setMinimumSize(new Dimension(700,10));
		blank.setMaximumSize(new Dimension(700,10));
		
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
		jokerTelefon.setEnabled(Spiel.getInstance().isJokerTelefon());
		buttonListener.getButtonHashMap().put("joker50", joker50);
		joker50.addActionListener(this.buttonListener);
		joker50.setPreferredSize(new Dimension(500,50));	
		joker50.setEnabled(Spiel.getInstance().isJoker50());
		buttonListener.getButtonHashMap().put("jokerPublikum", jokerPublikum);
		jokerPublikum.addActionListener(this.buttonListener);
		jokerPublikum.setPreferredSize(new Dimension(500,50));	
		jokerPublikum.setEnabled(Spiel.getInstance().isJokerPublikum());
		
		buttonListener.getButtonHashMap().put("ende", jButtonEnde);
		jButtonEnde.addActionListener(this.buttonListener);
		jButtonEnde.setPreferredSize(new Dimension(300,30));
				
		jPanelKopf.add(jButtonEnde, BorderLayout.PAGE_START);		
		jPanelAntwortoben.add(antwort1, BorderLayout.LINE_START);
		jPanelAntwortoben.add(antwort2, BorderLayout.LINE_END);
		jPanelAntwortunten.add(antwort3, BorderLayout.LINE_START);
		jPanelAntwortunten.add(antwort4, BorderLayout.LINE_END);
		jPanelFrage.add(frage,BorderLayout.CENTER);
		
		switch(Spiel.getInstance().getNummerFrage()) {
			case 1:
				frage1.setOpaque(true);
				frage1.setBackground(Color.yellow);
				break;
			case 2:
				frage2.setOpaque(true);
				frage2.setBackground(Color.yellow);
				break;
			case 3:
				frage3.setOpaque(true);
				frage3.setBackground(Color.yellow);
				break;
			case 4:
				frage4.setOpaque(true);
				frage4.setBackground(Color.yellow);
				break;
			case 5:
				frage5.setOpaque(true);
				frage5.setBackground(Color.yellow);
				break;
			case 6:
				frage6.setOpaque(true);
				frage6.setBackground(Color.yellow);
				break;
			case 7:
				frage7.setOpaque(true);
				frage7.setBackground(Color.yellow);
				break;
			case 8:
				frage8.setOpaque(true);
				frage8.setBackground(Color.yellow);
				break;
			case 9:
				frage9.setOpaque(true);
				frage9.setBackground(Color.yellow);
				break;
			case 10:
				frage10.setOpaque(true);
				frage10.setBackground(Color.yellow);
				break;
			case 11:
				frage11.setOpaque(true);
				frage11.setBackground(Color.yellow);
				break;
			case 12:
				frage12.setOpaque(true);
				frage12.setBackground(Color.yellow);
				break;
			case 13:
				frage13.setOpaque(true);
				frage13.setBackground(Color.yellow);
				break;
			case 14:
				frage14.setOpaque(true);
				frage14.setBackground(Color.yellow);
				break;
			case 15:
				frage15.setOpaque(true);
				frage15.setBackground(Color.yellow);
				break;
			default:
				break;
		}
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
				
		GroupLayout layoutGeld = new GroupLayout(jPanelGeld);
		layoutGeld.setAutoCreateGaps(true);
		layoutGeld.setAutoCreateContainerGaps(true);
		layoutGeld.setHorizontalGroup(layoutGeld.createSequentialGroup()
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(frage15)
						.addComponent(frage14)
						.addComponent(frage13)
						.addComponent(frage12)
						.addComponent(frage11)
						.addComponent(frage10)
						.addComponent(frage9)
						.addComponent(frage8)
						.addComponent(frage7)
						.addComponent(frage6)
						.addComponent(frage5)
						.addComponent(frage4)
						.addComponent(frage3)
						.addComponent(frage2)
						.addComponent(frage1)));
		layoutGeld.setVerticalGroup(layoutGeld.createSequentialGroup()
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage15))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage14))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage13))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage12))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage11))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage10))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage9))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage8))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage7))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage6))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage5))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage4))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage3))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage2))
				.addGroup(layoutGeld.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(frage1)));
		jPanelGeld.setLayout(layoutGeld);
				
		GroupLayout layoutMitte = new GroupLayout(jPanelMitte);
		layoutMitte.setAutoCreateGaps(true);
		layoutMitte.setAutoCreateContainerGaps(true);
		layoutMitte.setHorizontalGroup(layoutMitte.createSequentialGroup()
				.addGroup(layoutMitte.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanelJoker))
		        .addGroup(layoutMitte.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(blank))	
				.addGroup(layoutMitte.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jPanelGeld)));
		layoutMitte.setVerticalGroup(layoutMitte.createSequentialGroup()
				.addGroup(layoutMitte.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jPanelJoker)
						.addComponent(blank)
						.addComponent(jPanelGeld)));
		jPanelMitte.setLayout(layoutMitte);
		
/*		jMainPanel.add(jPanelKopf, BorderLayout.PAGE_START);
		jMainPanel.add(jPanelMitte, BorderLayout.CENTER);
		jMainPanel.add(jPanelUnten, BorderLayout.PAGE_END); */
		
		GroupLayout layoutMain = new GroupLayout(jMainPanel);
		layoutMain.setAutoCreateGaps(true);
		layoutMain.setAutoCreateContainerGaps(true);
		layoutMain.setHorizontalGroup(layoutMain.createSequentialGroup()
				.addGroup(layoutMain.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(jPanelKopf)
						.addComponent(jPanelMitte)
						.addComponent(jPanelUnten)));
		layoutMain.setVerticalGroup(layoutMain.createSequentialGroup()				
				.addGroup(layoutMain.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jPanelKopf))
				.addGroup(layoutMain.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jPanelMitte))
				.addGroup(layoutMain.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jPanelUnten)));
		jMainPanel.setLayout(layoutMain);
		
		jMainPanel.setPreferredSize(new Dimension(1200,1000));
		jPanel.add(jMainPanel);
		return jPanel;
	}	
		public void joker50 (int ersteAntwort, int zweiteAntwort ) {
			if(ersteAntwort == 1) {
			       antwort1.setEnabled(false);
			    }
			if(ersteAntwort == 2) {
				   antwort2.setEnabled(false);
				}
			if(ersteAntwort == 3) {
				   antwort3.setEnabled(false);
				}
			if(ersteAntwort == 4) {
				   antwort4.setEnabled(false);
				}
			if(zweiteAntwort == 1) {
			       antwort1.setEnabled(false);
			    }
			if(zweiteAntwort == 2) {
				   antwort2.setEnabled(false);
				}
			if(zweiteAntwort == 3) {
				   antwort3.setEnabled(false);
				}
			if(zweiteAntwort == 4) {
				   antwort4.setEnabled(false);
				}			
	    }		
}
