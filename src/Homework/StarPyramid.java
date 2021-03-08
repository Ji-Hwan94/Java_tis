package Homework;

import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
			
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			System.out.println("*".repeat(2*i-1));
		}
		scanner.close();
	}
}
