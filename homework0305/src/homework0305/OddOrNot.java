package homework0305;

import java.util.Scanner;

public class OddOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요!");
		
		int number = scanner.nextInt();
		
		if (number % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		scanner.close();

	}

}
