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
public class ImplementingAnimalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
human vasu = new human();
vasu.sleep();
vasu.eat();
vasu.speak();
	}

}
