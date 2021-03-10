package sample;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력해주세요! 끝내시려먼 -1을 눌러주세요");
		
		int n = scanner.nextInt();
		
		while (n != -1) {
			sum += n;
			count ++;
			n = scanner.nextInt();
		}
		
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 갯수는 " + count + "개 입니다.");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		scanner.close();
	}

}
