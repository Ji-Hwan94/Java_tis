package Homework;

interface Mouse {
	void goLeft(); 	
	void goRight();
	void mouseMove();
}

class WheelMouse implements Mouse {
	public String wheel;
	public void setWeel(String w) {
		this.wheel = w;
	}
	
	public void move() {
		System.out.println(wheel + "�� ��ũ���� ��ų�� �־��");
	}

	@Override
	public void goLeft() {
		System.out.println("���� Ŭ��");
		
	}

	@Override
	public void goRight() {
		System.out.println("������ Ŭ��");
		
	}

	@Override
	public void mouseMove() {
		System.out.println("��������");
		
	}
}

class MouseWithLaser extends WheelMouse{
	public String laser;
	
	public void set(String l) {
		this.laser = l;
	}
	
	public void move() {
		System.out.println("���� �ʿ� �����");
		System.out.println(laser + " : ������");
	}
	
}

public class MouseMove {
	public static void main(String[] args) {

		WheelMouse wheel = new WheelMouse();
		wheel.setWeel("Wheel Mouse");
		wheel.mouseMove();
		wheel.move();
		
		System.out.println();
		
		MouseWithLaser laser = new MouseWithLaser();
		laser.set("laser");	
		laser.move();
		
		
	}

}