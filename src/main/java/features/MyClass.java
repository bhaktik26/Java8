
package features;


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
		// TODO Auto-generated method stub
		MyFuncInterface.super.m1();
	}

	@SuppressWarnings({ "javadoc", "nls" })
	static int m2() {
		System.out.println("MyClass");
		return 3;
	}

	@SuppressWarnings({ "javadoc", "nls" })
	public static void main(String args[]) {
		System.out.println("Main");
		MyFuncInterface.m2();
		m2();
	}

}
