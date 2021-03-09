package homework0305;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 입력해주세요");
		
		double korean = scanner.nextDouble();
		double english = scanner.nextDouble();
		double math = scanner.nextDouble();
		
		double average = (korean + english + math) / 3;
		
		System.out.println("당신의 평균 점수는 " + average + "점 입니다." );
		
		scanner.close();
	}

}
