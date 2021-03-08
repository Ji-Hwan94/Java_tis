package Homework;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		
		String star = "*";
		String blank = " ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j <= i; j++) {
				if((int)i%2==0) continue;
					else {
					System.out.print("*".repeat((int)j*2 -1));
				} 
				System.out.println();
			}
			scanner.close();
		}

	}
}
