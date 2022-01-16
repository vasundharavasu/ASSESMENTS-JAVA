package gen_day5;
interface Method1{
	void display();
}
class Multi{
	public static int m1(int x,int y) {
		return x*y+x;
		
	}
}
public class Test1 {
public static void privatemethod() {
	System.out.println("this is private static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method1 m1 = Test1::privatemethod;
m1.display();
Method1 mm =()->(System.out.println(" "));

	
	}
}


