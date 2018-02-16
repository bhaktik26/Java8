
package features;

@SuppressWarnings({ "nls", "javadoc" })
public class LambdaExpressionExample {
	/**
	 * @param args
	 */
	
	public static void main(String args[]) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Using anonymous class");

			}
		};

		Runnable r2 = () -> System.out.println("Using lambda"); 
		r1.run();
		r2.run();

	}
}
