package factory_method._interface.factory;

import factory_method._interface.product.CreditCard;
import factory_method._interface.product.Product;

public class CreditCardFactory implements ProductFactory {

	@Override
	public void registerProduct(Product product) {
		System.out.println("Credit card registered: " + product);
	}

	@Override
	public Product createProduct(String owner) {
		return new CreditCard(owner);
	}
}
