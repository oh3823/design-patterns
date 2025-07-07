package template_method._interface;

public class Main {

	public static void main(String[] args) {
		Display charDisplay = new CharDisplay('H');
		charDisplay.display();
		Display stringDisplay = new StringDisplay("Hello, world!");
		stringDisplay.display();
	}

}
