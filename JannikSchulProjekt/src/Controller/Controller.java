package Controller;

public class Controller {
	private static Controller instance;
	
	public static Controller getInstance() {
		if (Controller.instance == null) {
			Controller.instance = new Controller();			
		}
		return Controller.instance;
	}
}
