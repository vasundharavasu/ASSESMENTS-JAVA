package gen_day3;
public interface In1{
public class NoOfPrimenumbers implements In1 {
	boolean isprime(int n) {
		if(n==1||n==0) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
public void display(int k) {
	int count = 0;
	for(int i=2;i<=k;i++) {
		if(isprime(i)) {
			count++;
			
		}
	}
	System.out.println(count);
}
}
}


