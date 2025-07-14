package decorator;

public class MilkDecorator extends CoffeeDecorator {

	protected MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", add milk";
	}

	@Override
	public int cost() {
		return super.cost() + 500;
	}
}
