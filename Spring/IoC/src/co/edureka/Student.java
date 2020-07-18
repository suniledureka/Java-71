package co.edureka;

public class Student {
	private String name;

	public Student() {
		System.out.println("Zero argument constructor");
	}

	public Student(String name) {
		this.name = name;
		System.out.println("One argument constructor");
	}

	public String getName() {
		System.out.println("Getter method of name");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter method of name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [" + name + "]";
	}

}
