package secondDay;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getName() + "吃东西");
	}
	
	public void sleep() {
		System.out.println(super.getName()  +  "睡觉");
	}
}
