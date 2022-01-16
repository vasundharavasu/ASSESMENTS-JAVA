package gen_day_9;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {
		
	}catch (Exception e) {
		// TODO: handle exception
	}
	   System.out.println(" State of thread while it called join() on thread2 " + Test.thread1.getState());

	   try {
	       Thread.sleep(200);
	   }catch(Exception e) {

	}

}
}