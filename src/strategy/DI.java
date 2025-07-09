package strategy;

import java.util.HashMap;
import java.util.Map;
import strategy.strategies.PaymentStrategy;

public class DI {

	public static void main(String[] args) {
		Map<String, PaymentStrategy> paymentStrategyMap = new HashMap<>();
		paymentStrategyMap.put("kakaopay", () -> System.out.println("Pay with kakao pay"));
		paymentStrategyMap.put("applepay", () -> System.out.println("Pay with apple pay"));

		PaymentService paymentService = new PaymentService(paymentStrategyMap);

		// 사용자 요청
		paymentService.processPayment("kakaopay");
		paymentService.processPayment("applepay");
	}
}
