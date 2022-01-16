package gen_day6;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x =5;
try {
	int arr[] = new int[5];
	arr[7] = 23;
	arr[4] = 10/0;

}catch(ArithmeticException e) {
	System.out.println("you can not divide the number by zero");
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("array of 7 is not declared");
}catch(Exception e) {
	System.out.println("some other exception e"+e);
}
System.out.println("out of try catch");
	}

}
