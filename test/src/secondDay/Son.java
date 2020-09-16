package secondDay;

public class Son extends Person{
	
	public Son() {
		System.out.println("子类后被调用");
	}

	public static void main(String[] args) {
		Son son = new Son();
	}
}
