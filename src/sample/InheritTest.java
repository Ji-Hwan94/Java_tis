package sample;
class Person {
	public String name;
	public Person() {};
	public Person(String name ) {
		this.name = name;
	} 
	
	public void speak() {
		System.out.println("���ϱ�");
	}
	public void eat() {
		System.out.println("�Ա�");
	}
	public void walk() {
		System.out.println("�ȱ�");
	}
	public void sleep() {
		System.out.println("�ڱ�");
	}
}

class Student extends Person{
	public void study() {
		System.out.println("�����ϱ�");
	}
}

class StudentWorker extends Student{
	public void work() {
		System.out.println("���ϱ�");
	}
}

class Researcher extends Person {
	public void research() {
		System.out.println("�����ϱ�");
	}
}

class Professer extends Researcher {
	public void teach() {
		System.out.println("����ġ��");
	}
}

public class InheritTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.name ="ȫ�浿";
		p.sleep();
		
		Student s = new Student();
		s.name = "�̼���";
		s.study();
		s.eat();
		
		StudentWorker sw = new StudentWorker();	
		sw.name = "�հ�";
		sw.study();
		sw.work();
		
		Researcher r = new Researcher();
		r.research();
		r.walk();
		
		Professer pr = new Professer();
		pr.research();
		pr.sleep();

		Person p2 = new Person("������");
		System.out.println(p2.name);      

	}

}
