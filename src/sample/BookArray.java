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
			System.out.print("力格 >> ");
			String n = scanner.next();
			
			System.out.print("累啊 >> ");
			String a = scanner.next();
			
			book[i] = new BookArray(n, a);
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.println("力格 : " + book[i].name + "历磊 : " + book[i].author);
		}

	}

}
