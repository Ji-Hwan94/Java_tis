package sample;

import java.util.Scanner;

public class BookArray {
	String name;
	String author;
	
	public BookArray(String n, String a) {
		this.name = n;
		this.author = a;
	}
	public static void main(String[] args) {
		BookArray[] book = new BookArray[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {
			System.out.print("���� >> ");
			String n = scanner.next();
			
			System.out.print("�۰� >> ");
			String a = scanner.next();
			
			book[i] = new BookArray(n, a);
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.println("���� : " + book[i].name + "���� : " + book[i].author);
		}

	}

}
