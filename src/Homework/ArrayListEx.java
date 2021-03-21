import java.util.ArrayList;

import java.util.Scanner;

 

class Memeber {

	private String name;

	private int num;

	

	public Memeber() {};

	

	public Memeber (String name, int num) {

		this.name = name;

		this.num = num;

	}

	

	public void setName(String name) {

		this.name = name;

	}

	

	public void setNum(int num) {

		this.num = num;

 	}

	

	public String getName() {

		return name;

	}

	

	public int getNum() {

		return num;

	}

}

 

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Memeber> a = new ArrayList<Memeber>();
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i < 4; i++) {
			Memeber list = new Memeber();
			String s = scanner.next();
			int n = scanner.nextInt();
			list.setName(s);
			list.setNum(n);
			a.add(i, list);
		}
		
		for(int i=0; i<a.size(); i++) {
			//list = a.get(i);
			System.out.println(a.get(i).getName() + " " + a.get(i).getNum());
		}
		scanner.close();
	}
}