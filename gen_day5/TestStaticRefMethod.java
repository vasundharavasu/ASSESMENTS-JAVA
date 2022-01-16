package gen_day5;
interface A{
	public boolean checkDigit(int x);
}
class Digit{
	public static boolean isDigit(int x) {
		return x>10 && x<10;
	}
}
public class TestStaticRefMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1 = (x)->{return x>10 && x<10;};
System.out.println(a1.checkDigit(20));
A a2 = Digit :: isDigit;
System.out.println(a2.checkDigit(9));

	}

}
