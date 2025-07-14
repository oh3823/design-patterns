package decorator;

public interface Coffee {

	String getDescription();

	int cost();

	default void printOrder() {
		System.out.println("Order: " + getDescription() + " (" + cost() + "원)");
	}
}
