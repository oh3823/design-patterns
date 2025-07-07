package adapter._interface;

import adapter.Banner;
import adapter.Print;

public class PrintBannerAdapter implements Print {

	private final Banner banner;

	public PrintBannerAdapter(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		banner.showWithParenthesis();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
