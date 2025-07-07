package factory_method._interface.example.di;

import factory_method._interface.factory.CreditCardFactory;
import factory_method._interface.factory.IDCardFactory;
import factory_method._interface.factory.ProductFactory;
import java.util.HashMap;
import java.util.Map;

public class DI {

	public static void main(String[] args) {
		Map<String, ProductFactory> productFactoryMap = new HashMap<>();
		productFactoryMap.put("IDCard", new IDCardFactory());
		productFactoryMap.put("CreditCard", new CreditCardFactory());

		Client client = new Client(productFactoryMap);
		client.useProduct("IDCard", "user");
	}
}