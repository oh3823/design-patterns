package factory_method._interface.example.non_di;

import factory_method._interface.factory.CreditCardFactory;
import factory_method._interface.factory.IDCardFactory;
import factory_method._interface.factory.ProductFactory;
import factory_method._interface.product.Product;

public class Client {

	public static void main(String[] args) {
		ProductFactory idCardFactory = new IDCardFactory();
		Product idCard = idCardFactory.create("user");

		ProductFactory creditCardFactory = new CreditCardFactory();
		Product creditCard = creditCardFactory.create("user");

		idCard.use();
		creditCard.use();
	}

}
