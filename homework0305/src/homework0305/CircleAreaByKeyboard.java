package homework0305;

import java.util.Scanner;

public class CircleAreaByKeyboard {

	public static void main(String[] args) {
		final double PI = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������� �Է����ּ���");
		
		double radius = scanner.nextDouble();
		double circleArea = radius*radius*PI;
		
		System.out.println("�������� : " + circleArea);
		
		scanner.close();

	}

}
