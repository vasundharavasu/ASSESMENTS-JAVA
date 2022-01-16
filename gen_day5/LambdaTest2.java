package gen_day5;
interface Myinterface{
	String reverse(String n);
	
}
public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myinterface ref = (str) -> {
	String result = "";
	for(int i=str.length();i>=0;i--) 
		result +=str.charAt(i);
		return result;
		
	};
System.out.println(ref.reverse("Lambda"));

};
	}

	

