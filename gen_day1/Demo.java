package gen_day1;

public class Demo {
	String name ;
	String company ;
	int empID ;
	double salary ;
	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
void display() {
	 System.out.println("Employee Name : "+ name);
     System.out.println("Employee Comp : "+ company);
     System.out.println("Employee Id : "+ empID);
     System.out.println("Employee salary : "+ salary);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Demo emp1 = new Demo();
Demo emp2 = new Demo2 ("vasu", "Genp" , 222 , 3.5);




	}

	\\The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.\\
}

