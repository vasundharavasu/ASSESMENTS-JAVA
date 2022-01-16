package gen_day3;

class Teacher extends Person{
	static int count = 20;
	String subject;
	int exp;
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher t = new Teacher();
t.name = "Seema";
System.out.println( t.name);
System.out.println(t.count);
	}

}
