package factory_method._interface.example.simple_factory;

import factory_method._interface.product.CreditCard;
import factory_method._interface.product.IDCard;
import factory_method._interface.product.Product;

public class SimpleFactory {

	public static Product createCard(String type, String owner) throws Exception {
		if ("IDCard".equals(type)) {
			return new IDCard(owner);
		} else if ("CreditCard".equals(type)) {
			return new CreditCard(owner);
		} else {
			throw new Exception();
		}
	}

	public static IDCard createIDCard(String owner) {
		return new IDCard(owner);
	}

	public static CreditCard createCreditCard(String owner) {
		return new CreditCard(owner);
	}
}
