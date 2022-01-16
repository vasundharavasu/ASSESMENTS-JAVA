package gen_day3;
//

interface TestInterface{
	//abstract method
	public void add(int x,int y);
	
	//default method
	default void show() {
		System.out.println("Default method using under functional interface");
	}
	default int calculate(int p,int q,int r) {
		return p*q*r;
	}
}

public class JavaFunctionalnterface implements TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JavaFunctionalInterface jf = new JavaFunctionalInterface();

jf.add(4,5);
jf.show();
int c = jf.calculate(2,3,4);
System.out.println(c);
}

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}
}
