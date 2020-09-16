package secondDay;

public class Animal {
	
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("动物吃东西");
	}
	
	public static void main(String[] args) {
		Animal animal = new Cat("金丝猫");
		animal.eat();
		Cat cat = (Cat)animal;
		cat.sleep();
	}
}
