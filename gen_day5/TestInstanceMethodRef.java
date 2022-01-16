package gen_day5;
interface B{
	public void  add(int x , int y);
}
class Addition{
	public void sum(int a , int b) {
		System.out.println("sum is "+(a+b));
	}
	
}

public class TestInstanceMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition addi = new Addition();
B b1 = (a,b)->System.out.println(a+b);
b1.add(10, 14);
B b2 = addi::sum;
b2.add(100, 12);

	}

}
