package decorator;

public class Americano implements Coffee {

	@Override
	public String getDescription() {
		return "Americano";
	}

	@Override
	public int cost() {
		return 1500;
	}
}
