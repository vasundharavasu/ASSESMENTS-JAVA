package gen_day_9;

public class Test implements Runnable {
	public static Thread thread1;
	public static Test obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 obj = new Test();
   thread1 = new Thread(obj);
   System.out.println("state of thread1 after creaing it "+ thread1.getState());//new
thread1.start();
 System.out.println("state of thread1 after calling .start() method on it "+ thread1.getState());//runnable
		}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread1 mythread = new Thread1();
		 Thread thread2 = new Thread(mythread);
		 
		 
		 System.out.println(" state of thread2 after creating it - " + thread2.getState());//new
		 thread2.start();
		    System.out.println("state of thread2 after calling .start()" + thread2.getState());//runnable
		try {
		    Thread.sleep(200);
		}catch(Exception e) {

		}
		System.out.println("state of thread2 after calling  . sleep" + thread2.getState());

		try {
		    thread2.join();
		}catch (Exception e) {
		    // TODO: handle exception
		}
		System.out.println("state of thread2 when it has finished execution  "+ thread2.getState());
		    }
		 
		
	}


