package View;

import javax.swing.*;


public class StartMenu {
	private static StartMenu instance;
	JPanel jPanel = new JPanel();
	ButtonListener buttonListener = new ButtonListener();
	JButton start = new JButton("Absturz beginnen");
	JButton plus = new JButton("+");
	public StartMenu() {
		
	}
	
	public static StartMenu getInstance() {
		if (StartMenu.instance == null) {
			StartMenu.instance = new StartMenu();
		}
		return StartMenu.instance;
	}
	
	public JPanel erstelleStartMenu() {
		
		GroupLayout layout = new GroupLayout(jPanel);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(start)));
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(start)));
		return jPanel;
	}
	
	
}
