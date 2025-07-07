package factory_method._interface.factory;

import factory_method._interface.product.Product;

public interface ProductFactory {

	default Product create(String owner) {
		Product product = createProduct(owner);
		registerProduct(product);
		return product;
	}
	
	void registerProduct(Product product);

	Product createProduct(String owner);
}
