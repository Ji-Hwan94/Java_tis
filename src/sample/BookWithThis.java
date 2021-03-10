package sample;

public class BookWithThis {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public BookWithThis() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public BookWithThis(String title) {
		this(title, "작자미상");
	}
	
	public BookWithThis(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	

	public static void main(String[] args) {
		//BookWithThis littlePrince = new BookWithThis("어린왕자", "생택쥐페리");
		BookWithThis loveStory = new BookWithThis("춘향전");
		//BookWithThis untitle = new BookWithThis();
		
		loveStory.show();
	}

}
