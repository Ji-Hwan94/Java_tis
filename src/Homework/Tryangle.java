package Homework;

import java.util.Scanner;

public class Tryangle {
	int base;
	int height;
	
	public Tryangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	void result () {
		System.out.println("���� : " + base*height/2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�غ�");
		int base = scanner.nextInt();
		
		System.out.println("����");
		int height = scanner.nextInt();
		
		Tryangle tryangle = new Tryangle(base, height);
		
		tryangle.result();
		
		scanner.close();
	}

}
