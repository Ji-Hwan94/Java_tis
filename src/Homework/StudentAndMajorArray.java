package Homework;

import java.util.Scanner;

public class StudentAndMajorArray {
	String student;
	String major;
	
	public StudentAndMajorArray(String s, String m) {
		this.student = s;
		this.major = m;
	}

	public static void main(String[] args) {
		StudentAndMajorArray [] sam;
		sam = new StudentAndMajorArray[5];

		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<sam.length; i++) {
			System.out.println("이름: ");
			String name = scanner.next();
			System.out.println("전공: ");
			String major = scanner.next();
			sam[i] = new StudentAndMajorArray(name, major);
		}
		
		for(int i=0; i<sam.length; i++) {
			System.out.println("(" + sam[i].student + ", " + sam[i].major + ")");
		}
		
		scanner.close();
	}

}
