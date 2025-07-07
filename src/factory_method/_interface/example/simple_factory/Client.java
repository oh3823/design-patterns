package factory_method._interface.example.simple_factory;

import factory_method._interface.product.CreditCard;
import factory_method._interface.product.IDCard;

public class Client {

	public static void main(String[] args) {
		IDCard idCard = SimpleFactory.createIDCard("user");
		CreditCard creditCard = SimpleFactory.createCreditCard("user");
		idCard.use();
		creditCard.use();
	}

}
