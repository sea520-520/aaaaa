package secondDay;

public class Student {

	private String name;
	
	private Integer age;
	
	private String className;
	

	public Student(String name, Integer age, String className) {
		this.name = name;
		this.age = age;
		this.className = className;
	}
	
	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Demo1 [name=" + name + ", age=" + age + ", className=" + className + "]";
	}
	
	public static void main(String[] args) {
		Student student = new Student("xiaohai",18,"190738");
		System.out.println(student);
	}
}
