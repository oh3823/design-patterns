package factory_method._interface.product;

public class IDCard implements Product {

	private final String owner;

	public IDCard(String owner) {
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("Use: " + this);
	}

	@Override
	public String toString() {
		return "[IDCard:" + owner + "]";
	}

	public String getOwner() {
		return owner;
	}
}
