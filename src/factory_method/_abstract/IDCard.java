package factory_method._abstract;

public class IDCard extends Product {

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
