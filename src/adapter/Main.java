package adapter;

public class Main {

	public static void main(String[] args) {
		Print printer1 = new PrintBannerAdapterComposition("Hello");
		printer1.printWeak();
		printer1.printStrong();

		Print printer2 = new PrintBannerAdapterInheritance("Hello");
		printer2.printWeak();
		printer2.printStrong();
	}

}

