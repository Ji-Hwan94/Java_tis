package homework0305;

import java.util.Scanner;

public class Information {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름, 학번, 학과를 입력해주세요");
		
		String name = scanner.next();
		System.out.println("안녕하세요 " + name +" 님!");
		
		int number = scanner.nextInt();
		System.out.println("당신의 학번은 " + number + " 입니다");
		
		String major = scanner.next();
		System.out.println(major + "의 입학을 축하드립니다!!");
		
		
		scanner.close();
	}

}
