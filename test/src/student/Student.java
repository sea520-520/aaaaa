package student;

public class Student {

	private String name;
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void study() {
		System.out.println(this.name + "的任务是:good good study day day up");
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
