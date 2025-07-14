package decorator;

public abstract class CoffeeDecorator implements Coffee {

	protected final Coffee coffee;

	protected CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription();
	}

	@Override
	public int cost() {
		return coffee.cost();
	}
}
