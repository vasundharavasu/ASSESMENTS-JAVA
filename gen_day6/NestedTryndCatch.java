package gen_day6;

public class NestedTryndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {//main parent
	
	try {
		System.out.println("Inside block 1");
		int p = 100/0;
		System.out.println(p);
		
	}catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Exception e1");
	}
	try {
		System.out.println("Inside block 2");
		int q = 20/0;
		System.out.println(q);	
	}catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("Exception 2");
	}

	}catch(ArithmeticException e) {
		System.out.println("Arithematic Exception");
		System.out.println("Parent try block");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array problem");
		System.out.println("Inside parent try");
	}
System.out.println("default");
	}
}
