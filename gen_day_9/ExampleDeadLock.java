package gen_day_9;

public class ExampleDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "StripeData";
String s2 = "Java FSD";

Thread t1 = new Thread() {
public void run() {
	synchronized(s1) {
		System.out.println("Thread1 : Locked S1");
	
	try {
		Thread.sleep(200);
	}catch (Exception e) {
		// TODO: handle exception
	}
	synchronized(s2) {
		System.out.println("Thread2 : Locked S2");
	}
}
}
	};
Thread t2 = new Thread() {
	public void run() {
		synchronized(s1) {
				System.out.println("Thread1 : Locked S1");
			
			try {
				Thread.sleep(200);
			}catch (Exception e) {
				// TODO: handle exception
			}
			synchronized(s2) {
				System.out.println("Thread2 : Locked S2");
		}
}
}
};
t1.start();
t2.start();
	}
}
