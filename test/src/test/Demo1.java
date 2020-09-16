package test;

import java.util.Scanner;

import student.Student;
import teacher.Teacher;

public class Demo1 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setAge(18);
		teacher.setName("��ʦA");
		teacher.work();
		System.out.println("��ʦ������Ϊ��" + teacher.getAge());
		System.out.println("��ʦ������Ϊ��" +teacher.getName());
		
		Student student = new Student();
		student.setAge(11);
		student.setName("С��");
		System.out.println("ѧ��������Ϊ��" + student.getAge());
		System.out.println("ѧ��������Ϊ��" + student.getName());
		student.study();
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()) {
			String input = scanner.next();
			System.out.println(input);
		}
		scanner.close();
	}
}
