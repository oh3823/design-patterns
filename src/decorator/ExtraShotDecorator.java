package decorator;

public class ExtraShotDecorator extends CoffeeDecorator {

	protected ExtraShotDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", add extra shot";
	}

	@Override
	public int cost() {
		return super.cost() + 800;
	}
}
