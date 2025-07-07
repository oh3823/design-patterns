package factory_method._interface.factory;

import factory_method._interface.product.IDCard;
import factory_method._interface.product.Product;

public class IDCardFactory implements ProductFactory {

	@Override
	public void registerProduct(Product product) {
		System.out.println("ID card registered: " + product);
	}

	@Override
	public Product createProduct(String owner) {
		return new IDCard(owner);
	}
}
