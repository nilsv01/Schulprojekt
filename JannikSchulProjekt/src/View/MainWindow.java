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
		this.jFrame.setSize(1500, 1000);
		this.jFrame.setVisible(true);
		erstelleHauptmenu();
		return jFrame;
	}
	
	public static MainWindow getInstance() {
		if (MainWindow.instance == null) {
			MainWindow.instance = new MainWindow();
		}
		return MainWindow.instance;
	}
	
	public void erstelleHauptmenu() {
		JPanel jPanel = new JPanel();
		StartMenu startMenu = new StartMenu();
        MainWindow.getInstance().ueberarbeiteMainWindow(
        		startMenu.erstelleStartMenu());
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
