package decorator;

public class Client {

	public static void main(String[] args) {
		Coffee americano = new Americano();
		americano.printOrder();

		MilkDecorator latte = new MilkDecorator(americano);
		latte.printOrder();

		ExtraShotDecorator americanoWithExtraShot = new ExtraShotDecorator(americano);
		americanoWithExtraShot.printOrder();

		ExtraShotDecorator latteWithExtraShot = new ExtraShotDecorator(latte);
		latteWithExtraShot.printOrder();
	}

}
