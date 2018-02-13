
package features;


@SuppressWarnings({ "javadoc", "nls" })
@FunctionalInterface
public interface MyFuncInterface {

	int myMethod();
	// int my();

	default void m1() {
		System.out.println("HI");
	}

	static int m2() {
		System.out.println("In m2() of MyFuncInterface");
		return 0;
	}
}
