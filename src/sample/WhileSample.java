package sample;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է����ּ���! �����÷��� -1�� �����ּ���");
		
		int n = scanner.nextInt();
		
		while (n != -1) {
			sum += n;
			count ++;
			n = scanner.nextInt();
		}
		
		if(count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println("������ ������ " + count + "�� �Դϴ�.");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
		}
		scanner.close();
	}

}
