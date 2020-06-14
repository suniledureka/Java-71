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
	
	
	@Override
	public String toString() {
		return "Employee [" + empno + " | " + name + " | " + sal + "]";
	}

	public static void main(String[] args) 
	{
		/* -- create an Employee type object -- */
		Employee emp = new Employee();
		
		/*-- to display the state on object -- */
		System.out.println(emp.empno+ " | "+emp.name+" | "+emp.sal);

		/* -- to change the state of object using reference -- */
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		//System.out.println(emp.empno+ " | "+emp.name+" | "+emp.sal);
		emp.displayDetails();
		
		/*-- to change the state of an object using method --*/
		emp.setDetails();
		emp.displayDetails();
		
		System.out.println(emp); //calls toString()
	}
}
