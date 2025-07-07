package adapter;

import adapter._interface.PrintBannerAdapter;

public class Main {

	public static void main(String[] args) {
		Print printer1 = new PrintBannerAdapter("Hello");
		printer1.printWeak();
		printer1.printStrong();

		Print printer2 = new adapter._abstract.PrintBannerAdapter("Hello");
		printer2.printWeak();
		printer2.printStrong();
	}

}

