
package features;

@SuppressWarnings({ "javadoc", "nls" })
@FunctionalInterface
public interface MyFuncInterface2 {

	int my1();

	default void m1() {
		System.out.println("HELLO");
	}

	static int m2() {
		System.out.println("MyFuncInterface2");
		return 1;
	}
}
