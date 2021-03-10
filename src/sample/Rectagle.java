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
		System.out.println("세로 " + rect.height + ", 가로 " + rect.width + "의 직사각형의 넓이는 " + rect.getArea() + " 입니당" );
		
		scanner.close();
	}

}
