package View;
import javax.swing.*;

import View.*;

public class StartMenu {
	JPanel jPanel = new JPanel();
	ButtonListener buttonListener = new ButtonListener();
	JButton startButton = new JButton("Start");
	public StartMenu() {
		
	}
	
	public JPanel erstelleStartMenu() {
		
		buttonListener.getButtonHashMap().put("Start", startButton);
		startButton.addActionListener(this.buttonListener);
		
		GroupLayout layout = new GroupLayout(jPanel);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(startButton)));
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(startButton)));
		return jPanel;
	}
	
	
}