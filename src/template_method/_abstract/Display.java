package template_method._abstract;

public abstract class Display {

	protected abstract void open();

	protected abstract void print();

	protected abstract void close();

	public final void display() {
		open();
		for (int i = 0; i < 5; ++i) {
			print();
		}
		close();
	}

}
