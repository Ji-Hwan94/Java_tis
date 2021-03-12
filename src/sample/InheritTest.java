package sample;
class Person {
	public String name;
	public Person() {};
	public Person(String name ) {
		this.name = name;
	} 
	
	public void speak() {
		System.out.println("말하기");
	}
	public void eat() {
		System.out.println("먹기");
	}
	public void walk() {
		System.out.println("걷기");
	}
	public void sleep() {
		System.out.println("자기");
	}
}

class Student extends Person{
	public void study() {
		System.out.println("공부하기");
	}
}

class StudentWorker extends Student{
	public void work() {
		System.out.println("일하기");
	}
}

class Researcher extends Person {
	public void research() {
		System.out.println("연구하기");
	}
}

class Professer extends Researcher {
	public void teach() {
		System.out.println("가르치기");
	}
}

public class InheritTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.name ="홍길동";
		p.sleep();
		
		Student s = new Student();
		s.name = "이순신";
		s.study();
		s.eat();
		
		StudentWorker sw = new StudentWorker();	
		sw.name = "왕건";
		sw.study();
		sw.work();
		
		Researcher r = new Researcher();
		r.research();
		r.walk();
		
		Professer pr = new Professer();
		pr.research();
		pr.sleep();

		Person p2 = new Person("이율곡");
		System.out.println(p2.name);      

	}

}
