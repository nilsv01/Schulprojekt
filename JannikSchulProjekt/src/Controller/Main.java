package Controller;

import View.MainWindow;

public class Main {
	
	public static void main(String[] args) {
		Controller controller = Controller.getInstance();
		MainWindow mainWindow = MainWindow.getInstance();
		mainWindow.erstelleMainWindow();
	}
}
