class MyClass{
	int n = 10;
	void change(MyClass obj) {
		obj.n=20;
		
		MyClass obj1 = new MyClass();
		obj1.n=20;
		obj=obj1;
	}
}

public class Passing {	
	static void change(int x) {
		x = 20;
	}
	public static void main(String[] args) {
		int x=10;
		System.out.println(x); //10
		change(x);
		System.out.println(x); //10
		
		System.out.println();
		MyClass obj = new MyClass();
		System.out.println(obj.n); //10
		obj.change(obj);
		System.out.println(obj.n); //10
	}
}
