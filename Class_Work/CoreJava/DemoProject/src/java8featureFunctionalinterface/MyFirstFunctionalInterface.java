package java8featureFunctionalinterface;

@FunctionalInterface
public interface MyFirstFunctionalInterface {
	public void firstwork();
	
	default void show() {
		System.out.println("do it now");
	}

	default void show1() {
		System.out.println("show1");
	}
	default void show2() {
		System.out.println("show2");
	}

}
