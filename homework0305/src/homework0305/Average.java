package homework0305;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ �Է����ּ���");
		
		double korean = scanner.nextDouble();
		double english = scanner.nextDouble();
		double math = scanner.nextDouble();
		
		double average = (korean + english + math) / 3;
		
		System.out.println("����� ��� ������ " + average + "�� �Դϴ�." );
		
		scanner.close();
	}

}
