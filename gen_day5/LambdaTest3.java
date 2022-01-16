package gen_day5;
interface GenericInter<T>{
	T fun(T t);
}
public class LambdaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInter<String> rev = (str) -> {
			String result = "";
			for(int i=str.length();i>=0;i--) 
				result +=str.charAt(i);
				return result;
		};
		System.out.println(rev.fun("Lambda"));
		GenericInter<Integer> fact = (n) -> {
		 int res = 1;
		 for(int i = 1;i<=n;i++) 
			 res = i*res;
			 return res;
		};
		
	
}
	
	
}

