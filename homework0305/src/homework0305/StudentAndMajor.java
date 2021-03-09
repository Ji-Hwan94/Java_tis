package homework0305;

import java.util.Scanner;
import java.util.Arrays;

public class StudentAndMajor {
	
	public static void main(String[] args) {
		String[][] array = new String[5][2];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름과 학번을 입력하세요");
		
		for(int i=0; i<5; i++) {
			String name = scanner.next();
			String major = scanner.next();
			 
			array[i][0] = name;
			array[i][1] = major;		 
			System.out.println("이름 : " + name + " 학번 : " + major);
		}
		System.out.println(Arrays.deepToString(array));
		scanner.close();
	}

}
