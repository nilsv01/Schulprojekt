package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.border.*;


public class MainWindow {
	private static MainWindow instance;
	private JFrame jFrame;
	private ButtonListener buttonListener = new ButtonListener();
	private JPanel panel = new JPanel();

	private MainWindow() {
	
	}
	
	public JFrame erstelleMainWindow() {

		this.jFrame = new JFrame("Gutachter Zuordnung");
		this.jFrame.setSize(1000, 1000);
		this.jFrame.setVisible(true);
		ueberarbeiteMainWindow(erstelleHauptmenu());
		return jFrame;
	}
	
	public static MainWindow getInstance() {
		if (MainWindow.instance == null) {
			MainWindow.instance = new MainWindow();
		}
		return MainWindow.instance;
	}
	
	public JPanel erstelleHauptmenu() {
		JPanel jPanel = new JPanel();
		
		JButton startButton = new JButton("Start");
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
	
	public void ueberarbeiteMainWindow(JPanel jPanel) {
		Component[] komponenten = jFrame.getContentPane().getComponents();
		for (Component komponente : komponenten) {
			this.jFrame.remove(komponente);
		}
		this.panel = jPanel;
		jPanel.setPreferredSize(new Dimension(800, 800));
		jPanel.setMaximumSize(new Dimension(900, 900));
		jPanel.setMinimumSize(new Dimension(100, 100));
		jPanel.setVisible(true);
		this.jFrame.add(panel);
		jPanel.setVisible(true);
		this.jFrame.setVisible(true);
	}
	
	public JFrame getMeinFrame() {
		return jFrame;
	}

	public void setMeinFrame(JFrame jFrame) {
		this.jFrame = jFrame;
	}

	public JPanel getPanel() {
		return this.panel;
	}

	public JFrame getJFrame() {
		return this.jFrame;
	}
}