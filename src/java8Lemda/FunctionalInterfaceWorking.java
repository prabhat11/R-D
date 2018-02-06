package java8Lemda;

public class FunctionalInterfaceWorking {
	public static void main(String[] args) {
		new Test() {
			@Override
			public void doWork() {
				System.out.println("hi from anonymous");
			}
		};
      System.out.println("hi");
	}

}

@FunctionalInterface
interface Test {
	public void doWork();

}
