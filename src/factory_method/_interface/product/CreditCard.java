package factory_method._interface.product;

public class CreditCard implements Product {

	private final String owner;

	public CreditCard(String owner) {
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("Use: " + this);
	}

	@Override
	public String toString() {
		return "[CreditCard:" + owner + "]";
	}

	public String getOwner() {
		return owner;
	}
}
