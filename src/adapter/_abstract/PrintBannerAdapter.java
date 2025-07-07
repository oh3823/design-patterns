package adapter._abstract;

import adapter.Banner;
import adapter.Print;

public class PrintBannerAdapter extends Banner implements Print {

	public PrintBannerAdapter(String string) {
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
