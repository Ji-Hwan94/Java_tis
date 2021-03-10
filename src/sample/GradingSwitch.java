package sample;

import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int score = scanner.nextInt();
		
		switch (score /10) {
			case 10:
			case 9:
				grade = 'A';
				break;
				
			case 8:
				grade = 'B';
				break;
				
			case 7:
				grade = 'C';
				break;
				
			case 6:
				grade = 'D';
				break;
				
			default:
				grade = 'F';
		}
		System.out.println("Your grade is " + grade );
		
		scanner.close();
	}

}
