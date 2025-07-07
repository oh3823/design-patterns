package adapter;

import adapter.banner.Banner;

public class PrintBannerAdapterComposition implements Print {

	private final Banner banner;

	public PrintBannerAdapterComposition(String string) {
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
