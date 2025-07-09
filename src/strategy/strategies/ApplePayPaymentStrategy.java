package strategy.strategies;

public class ApplePayPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Pay with apple pay");
	}
}
