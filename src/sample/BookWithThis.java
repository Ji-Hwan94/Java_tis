package sample;

public class BookWithThis {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public BookWithThis() {
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public BookWithThis(String title) {
		this(title, "���ڹ̻�");
	}
	
	public BookWithThis(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	

	public static void main(String[] args) {
		//BookWithThis littlePrince = new BookWithThis("�����", "�������丮");
		BookWithThis loveStory = new BookWithThis("������");
		//BookWithThis untitle = new BookWithThis();
		
		loveStory.show();
	}

}
