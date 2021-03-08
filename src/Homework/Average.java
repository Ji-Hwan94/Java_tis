package Homework;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생 이름, 국어, 영어, 수학 점수를 입력하세요.");
		
		String name = scanner.next();
		double kor = scanner.nextDouble();
		double eng = scanner.nextDouble();
		double math = scanner.nextDouble();
		
		while(true) {
			String text = scanner.nextLine();  
			if(text.equals("exit"))
				break;
			else {
			System.out.println(name + " 의 과목 평균은 " + (kor+eng+math)/3 + "점 입니다." );
			}
		}
		
		System.out.println("종료합니다");
		scanner.close();
	}
}
