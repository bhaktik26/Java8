
package features;

@SuppressWarnings({ "javadoc", "nls" })
public class MyClass implements MyFuncInterface, MyFuncInterface2 {

	@Override
	public int my1() {
		return 0;
	}

	@Override
	public int myMethod() {
		return 0;
	}

	@Override
	public void m1() {
		MyFuncInterface.super.m1();
		System.out.println("My method m1()");
	}

	static int m2() {
		System.out.println("In m2() of MyClass");
		return 3;
	}

	public static void main(String args[]) {
		System.out.println("Main");
		MyFuncInterface.m2();
		m2();
	}

}
