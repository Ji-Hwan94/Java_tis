package homework0305;

public class OneToTen {

	public static void main(String[] args) {
		int array[] = new int[10];
		int [] array2 = {1,2,3,4,5,6,7,8,9,10};
		
		
		for(int i=0; i<array.length;i++) {
			array[i] = i+1;
			System.out.print(array[i] + " ");
		}
		
		for(int i :array2) {
			System.out.println(i);
		}

	}

}
