package strategy.strategies;

public class KakaoPayPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println("Pay with kakao pay");
	}
}
