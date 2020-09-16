
/**
 * 4  * 测试实体类
 * 5  *
 * 6  * @author Wáng Chéng Dá
 * 7  * @create 2017-02-24 10:41
 * 浅复制（浅克隆） ：被复制对象的所有变量都含有与原来的对象相同的值，
 * 而所有的对其他对象的引用仍然指向原来的对象。换言之，浅复制仅仅复制
 * 所考虑的对象，而不复制它所引用的对象。
 */
public class PersonT {

    private String name;

    private int age;

    private String sex;

    public PersonT() {
    }

    public PersonT(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public PersonT(PersonT personT) {
        this.name = personT.name;
        this.age = personT.age;
        this.sex = personT.sex;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "PersonT{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
