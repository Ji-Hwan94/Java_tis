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
		System.out.println(wheel + "은 스크롤을 시킬수 있어요");
	}

	@Override
	public void goLeft() {
		System.out.println("왼쪽 클릭");
		
	}

	@Override
	public void goRight() {
		System.out.println("오른쪽 클릭");
		
	}

	@Override
	public void mouseMove() {
		System.out.println("움직여요");
		
	}
}

class MouseWithLaser extends WheelMouse{
	public String laser;
	
	public void set(String l) {
		this.laser = l;
	}
	
	public void move() {
		System.out.println("선이 필요 없어요");
		System.out.println(laser + " : 레이져");
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