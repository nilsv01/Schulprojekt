package View;

import java.awt.BorderLayout;

import javax.swing.*;

public class Endscreen {
	
	JPanel jPanel = new JPanel();
	JPanel jMainPanel = new JPanel();
	JButton jButton = new JButton("weiter");
	String nachricht;
	ButtonListener buttonListener = ButtonListener.getInstance();
	
	public Endscreen() {
		
	}
	
	public JPanel erstelleEndscreen(boolean sieg) {
		if(sieg){
			nachricht = "Herzlichen Glückwunsch! Sie sind schlauer als Trump";
		}else {
			nachricht = "Unangenehm. Aber als amerikanischer Präsident reichts";
		}
		
		JLabel jLabel = new JLabel(nachricht);		
		
		buttonListener.getButtonHashMap().put("Finish", jButton);
		jButton.addActionListener(this.buttonListener);
		
		GroupLayout layout = new GroupLayout(jPanel);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(jLabel)
						.addComponent(jButton)));
		layout.setVerticalGroup(layout.createSequentialGroup()				
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jButton)));
		jPanel.setLayout(layout);
		jMainPanel.add(jPanel, BorderLayout.CENTER);
		return jMainPanel;
	}	
}
