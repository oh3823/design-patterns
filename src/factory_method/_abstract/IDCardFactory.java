package factory_method._abstract;

public class IDCardFactory extends ProductFactory {

	@Override
	protected void registerProduct(Product product) {
		System.out.println("Registered: " + product);
	}

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
}
