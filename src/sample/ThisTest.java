package sample;

public class ThisTest {
	int radius;
	public ThisTest(int radius) {
		this.radius = radius;
	} //�����ڴ� return ���� ������ �ʴ´�. 
	
	public void set (int radius) {
		this.radius = radius;
		System.out.println(radius);
	} 

	public static void main(String[] args) {
		ThisTest ob1 = new ThisTest(1);
		ThisTest ob2 = new ThisTest(2);
		ThisTest ob3 = new ThisTest(3);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);

	}

}
