package strategy;

import strategy.strategies.PaymentStrategy;

//@Configuration
public class StrategyConfig {

	//	@Bean
	public PaymentStrategy kakaoPayPaymentStrategy() {
		return () -> System.out.println("Pay with kakao pay");
	}

	//	@Bean
	public PaymentStrategy applePayPaymentStrategy() {
		return () -> System.out.println("Pay with apple pay");
	}

}
