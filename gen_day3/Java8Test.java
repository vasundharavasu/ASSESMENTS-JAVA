package gen_day3;
//java 8 having SAM interface

@FunctionalInterface
interface square{   
	int cal(int x);// abstact method
	
}
public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 7;
Java8Test jt = new Java8Test();
int x = jt.cal(a);
System.out.println(x);
	}
	public int cal(int x) {
        // TODO Auto-generated method stub
        return x*x;
    }

 
}
