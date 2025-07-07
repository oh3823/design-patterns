package adapter;

import adapter.banner.Banner;

public class PrintBannerAdapterInheritance extends Banner implements Print {

	public PrintBannerAdapterInheritance(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParenthesis();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
}
