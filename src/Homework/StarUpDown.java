package Homework;

import java.util.Scanner;

public class StarUpDown {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}

}
