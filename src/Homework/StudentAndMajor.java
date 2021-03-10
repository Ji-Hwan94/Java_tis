package Homework;

import java.util.Scanner;

public class StudentAndMajor {
	String student;
	String major;
	
	void show () {
		System.out.println("학생이름 : " + student + " 전공 : " + major);
	}
	
	public StudentAndMajor(String s, String m) {
		this.student = s;
		this.major = m;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름과 전공을 입력하세요");
		String name = scanner.next();
		String major = scanner.next();
		
		
		StudentAndMajor sam = new StudentAndMajor(name, major);	
		
		sam.show();
		
		scanner.close();
	}

}
