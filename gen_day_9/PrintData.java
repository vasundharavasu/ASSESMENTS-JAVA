package gen_day_9;
//synchronization method
class DataDemo{
	synchronized void PrintNum(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
class Num2 extends Thread{
	DataDemo d;

	public Num2(DataDemo d) {
		super();
		this.d = d;
	}
	public void run() {
		d.PrintNum(5);
}
}

class Num1 extends Thread{
	DataDemo d;

	public Num1(DataDemo d) {
		super();
		this.d = d;
	}
	public void run() {
		d.PrintNum(4);
	}
}


public class PrintData {
	
public static void main(String[] args) {
	DataDemo obj = new DataDemo();
	Num1 t1 = new Num1(obj);
	Num2 t2 = new Num2(obj);
	t1.start();
	t2.start();
	
}
}

