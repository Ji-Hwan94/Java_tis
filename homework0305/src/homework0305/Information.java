package homework0305;

import java.util.Scanner;

public class Information {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�, �й�, �а��� �Է����ּ���");
		
		String name = scanner.next();
		System.out.println("�ȳ��ϼ��� " + name +" ��!");
		
		int number = scanner.nextInt();
		System.out.println("����� �й��� " + number + " �Դϴ�");
		
		String major = scanner.next();
		System.out.println(major + "�� ������ ���ϵ帳�ϴ�!!");
		
		
		scanner.close();
	}

}
