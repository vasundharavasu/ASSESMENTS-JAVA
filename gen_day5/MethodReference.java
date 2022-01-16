package gen_day5;
interface Method1{
	void display();
}
public class MethodReference {
public static void privatemethod() {
	System.out.println("this is private static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method1 m1 = MethodReference::privatemethod;
m1.display();
	}

}
