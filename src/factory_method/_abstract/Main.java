package factory_method._abstract;

public class Main {

	public static void main(String[] args) {
		ProductFactory productFactory = new IDCardFactory();
		Product card1 = productFactory.create("user1");
		Product card2 = productFactory.create("user2");
		Product card3 = productFactory.create("user3");

		card1.use();
		card2.use();
		card3.use();
	}

}
