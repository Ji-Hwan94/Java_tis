package Homework;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�л� �̸�, ����, ����, ���� ������ �Է��ϼ���.");
		
		String name = scanner.next();
		double kor = scanner.nextDouble();
		double eng = scanner.nextDouble();
		double math = scanner.nextDouble();
		
		while(true) {
			String text = scanner.nextLine();  
			if(text.equals("exit"))
				break;
			else {
			System.out.println(name + " �� ���� ����� " + (kor+eng+math)/3 + "�� �Դϴ�." );
			}
		}
		
		System.out.println("�����մϴ�");
		scanner.close();
	}
}
