package text3; 
import java.util.Scanner; 
public class Test { 
	public static void main(String[] args) { 
		int z = 0; 
		String[][] x = new String[3][3]; 
		Student[] a = new Student[3]; 
		Student s1 = new Student(1, "Tom", '男', "C"); 
		Student s2 = new Student(2, "Emma", '女', "Python"); 
		Student s3 = new Student(3, "Ben", '男', "JAVA"); 
		Teacher t1 = new Teacher(1, "王老师", '男', "C"); 
		Teacher t2 = new Teacher(2, "李老师", '女', "Python"); 
		Teacher t3 = new Teacher(3, "张老师", '男', "JAVA"); 
		Course c1 = new Course(13, "101", "7:50", t1); 
		Course c2 = new Course(20, "102", "9:40", t2); 
		Course c3 = new Course(21, "103", "13:30", t3); 
		System.out.println("教师信息:\n" + t1 + "\n" + t2 + "\n" + t3); 
		System.out.println("课程列表:\n" + c1 + "\n" + c2 + "\n" + c3); 
		System.out.println("学生信息:\n" + s1 + "\n" + s2 + "\n" + s3); 
	}
}
 