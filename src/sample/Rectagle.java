package sample;

import java.util.Scanner;

public class Rectagle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectagle rect;
		rect = new Rectagle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		rect.height = scanner.nextInt();
		rect.width = scanner.nextInt();
		System.out.println("���� " + rect.height + ", ���� " + rect.width + "�� ���簢���� ���̴� " + rect.getArea() + " �Դϴ�" );
		
		scanner.close();
	}

}
