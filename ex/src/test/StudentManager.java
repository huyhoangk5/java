package test;
import java.util.*;
public class StudentManager {
	private Scanner scanner;
	private Student[] students;
	int index = 0;
	
	public StudentManager() {
		System.out.println("Nhập vào số lượng học sinh/ sinh viên: ");
		scanner = new Scanner(System.in);
		int length = Integer.parseInt(scanner.nextLine());
		students = new Student[length];
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public void setStudent(Student[] students) {
		this.students = students;
	}
	
	public Student createStudent() {
		System.out.println("Nhập vào tên học sinh: ");
		String name = scanner.nextLine();
		System.out.println("Nhập vào giới tính học sinh: ");
		String gender = scanner.nextLine();
		System.out.println("Nhập vào ngày tháng năm sinh của học sinh: (dd/mm/yy)");
		String date = scanner.nextLine();
		System.out.println("Nhập vào địa chỉ của học sinh: ");
		String country = scanner.nextLine();
		System.out.println("Nhập vào tên ngành học của học sinh: ");
		String major = scanner.nextLine();
		Student s = new Student(name, gender, date, country, major);
		return s;
	}
	public void addStudent() {
		Student student = createStudent();
		students[index] = student;
		this.index ++;
	}
	
	public void display() {
		for (Student value : students) {
			if(value != null) {
				System.out.println(value.toString());
			}
		}
	}

}
