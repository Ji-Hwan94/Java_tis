package sample;

public class Circle {
	int radius;
	String name;
	
	public Circle(){ }
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
		
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "�� ������ " + area + " �Դϴ�.");
		
		Circle donut;
		donut = new Circle();
		donut.radius = 5;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		
		System.out.println(donut.name + "�� ������ " + area + " �Դϴ�.");
		

	}

}
