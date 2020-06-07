class Employee 
{
	/* member datas | properties | methods */
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		empno =102;
		name="Rahul";
		sal = 5000.25f;
	}

	void displayDetails(){
		System.out.println(empno + " | "+name+" | "+sal);
	}
	public static void main(String[] args) {
		System.out.println("Inside Employee class");
	}
} //class Employee

class ObjectTest1
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println(emp.empno+ " | "+emp.name+" | "+emp.sal);

		emp.displayDetails();

		emp.setDetails();
		emp.displayDetails();
	}
}
