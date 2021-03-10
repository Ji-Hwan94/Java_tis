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
		System.out.println("≥–¿Ã : " + base*height/2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("πÿ∫Ø");
		int base = scanner.nextInt();
		
		System.out.println("≥Ù¿Ã");
		int height = scanner.nextInt();
		
		Tryangle tryangle = new Tryangle(base, height);
		
		tryangle.result();
		
		scanner.close();
	}

}
