package strategy;

import java.util.Map;
import strategy.strategies.PaymentStrategy;

public class PaymentService {

	private final Map<String, PaymentStrategy> paymentStrategyMap;

	public PaymentService(Map<String, PaymentStrategy> paymentStrategyMap) {
		this.paymentStrategyMap = paymentStrategyMap;
	}

	public void processPayment(String type) {
		PaymentStrategy paymentStrategy = paymentStrategyMap.get(type);
		paymentStrategy.pay();
	}
}
