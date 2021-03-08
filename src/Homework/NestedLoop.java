package Homework;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + "X" + i + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}

	}

}
