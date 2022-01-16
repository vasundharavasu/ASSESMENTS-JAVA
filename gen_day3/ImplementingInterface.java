package gen_day3;
class monkey{
	 void jump()
	{
		System.out.println("monkey is jumping");
	}
	 void bite()
	{
		System.out.println("monkey is biting");
	}
	
}
interface BasicAnimal{
	void eat();
	void sleep();
}
class human extends monkey implements BasicAnimal{
	void speak() {
	System.out.println("Hello all");	
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
	}
	
}
public class ImplementingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
monkey m1 = new human();
m1.jump();
m1.bite();
BasicAnimal b1 = new human();
b1.eat();
b1.sleep();
	}

}
