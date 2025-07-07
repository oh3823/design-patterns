package template_method._interface;

public class CharDisplay implements Display {

	private final char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}
}
