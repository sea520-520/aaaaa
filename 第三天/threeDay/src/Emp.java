import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp implements Serializable {

//    创建Emp类
//    定义私有属性:
//    String name，int age，String gender ，int salary， Date hiredate;//入职时间
//    定义构造方法，以及属性get,set方法.
//            定义toString方法，格式如:
//    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
//    定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
//    实现序列化接口，并定义版本号。

    private static final  long  serialVersionUID = 1L;

    private String name;

    private Integer age;

    private String gender;

    private Integer salary;

    private Date hiredate;

    public Emp(String name, Integer age, String gender, Integer salary, String hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = dateForMat(hiredate);
    }

    public Date dateForMat(String hiredate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(hiredate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public String dateForParse() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(hiredate);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

//姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
    @Override
    public String toString() {
        return "姓名:" + this.name + "年龄：" + this.age
                + "性别：" + this.gender + "薪资：" + this.salary
                + "入职时间：" + this.dateForParse();
    }

    @Override
    public boolean equals(Object obj) {
        Emp emp = (Emp)obj;
        return this.name.equals(emp.getName()) &&
                this.age.equals(emp.getAge()) &&
                this.gender.equals(emp.getGender()) &&
                this.hiredate.equals(emp.getHiredate());
    }

    public static void main(String[] args) {
        Emp emp = new Emp("张三",25,"男",5000,"2020-01-11");
        Emp emp1 = new Emp("张三",25,"男",5000,"2020-01-11");
        Emp emp2 = new Emp("小妹",25,"女",5000,"2020-01-11");
        System.out.println(emp.toString());
        //true
        System.out.println(emp.equals(emp1));
        //false
        System.out.println(emp1.equals(emp2));
    }
}
