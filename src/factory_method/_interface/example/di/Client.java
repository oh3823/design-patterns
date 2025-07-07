package factory_method._interface.example.di;

import factory_method._interface.factory.ProductFactory;
import factory_method._interface.product.Product;
import java.util.Map;

public class Client {

	private final Map<String, ProductFactory> productFactoryMap;

	public Client(Map<String, ProductFactory> productFactoryMap) {
		this.productFactoryMap = productFactoryMap;
	}

	public void useProduct(String productType, String owner) {
		ProductFactory factory = productFactoryMap.get(productType);
		Product product = factory.create(owner);
		product.use();
	}
}
