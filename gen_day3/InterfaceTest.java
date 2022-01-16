package gen_day3;
//before java8
interface Robo1{
	void call_robo();
	void show();
	}
interface Robo2{
	void danceRobo();
	void show();
		}

public class InterfaceTest implements Robo2,Robo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfaceTest t = new InterfaceTest();
t.call_robo();
t.show();
	
		
	}

	@Override
	public void call_robo() {
		// TODO Auto-generated method stub
		System.out.println("calling robo");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing robo");
	}

}
