package gen_day3;
abstract class pen{
	abstract void write();
	abstract void refill();
}
class bluepen extends pen{
	public void write() {
		System.out.println("write");
	}
	public void refill() {
		System.out.println("refill");
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bluepen p1 = new bluepen();
p1.write();
p1.refill();

	}

}
