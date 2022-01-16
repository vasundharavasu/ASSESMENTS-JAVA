package gen_day3;
abstract class RBIBank{
	abstract int intgetInterestrate();
	
}
class AxisBank extends RBIBank{
	int intgetInterestrate() {
		return 7;
	}
}
class BOI extends RBIBank{
	int intgetInterestrate() {
		return 8;
	}
}
class IndiaBank extends RBIBank{
	int intgetInterestrate() {
		return 6;
	}
}
public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BOI b = new BOI();
int x = b.intgetInterestrate();
System.out.println(x);


	}

}
