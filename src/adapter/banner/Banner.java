package adapter.banner;

public class Banner {

	private final String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParenthesis() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
