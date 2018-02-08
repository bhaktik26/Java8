
package lambda.prime;

@SuppressWarnings({ "javadoc", "nls" })
public class Human {
	private String name;
	private int age;

	/**
	 * 
	 */
	public Human() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + this.name + ", age=" + this.age + "]";
	}

}
