final class A{
	//final void display(){}
}
class B extends A{
	void display(){}
}


class FinalTest 
{
	//final FinalTest(){} //error: modifier final not allowed here
	final int x; //blank final variable
	FinalTest(){
		this.x = 37;
	}
	final int age = 34; //instance variable
	public static void main(String[] args) 
	{
		final int n = 24; //local variable
		System.out.println(n);

		//n = 24; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.age);
		//obj.age = 35; //error: cannot assign a value to final variable age
		System.out.println(obj.age);
		System.out.println(obj.x);
	}
}
