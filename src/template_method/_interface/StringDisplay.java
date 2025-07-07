package template_method._interface;

public class StringDisplay implements Display {

	private final String string;
	private final int length;

	public StringDisplay(String string) {
		this.string = string;
		length = string.length();
	}

	@Override
	public void open() {
		printLine();
	}


	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < length; ++i) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
