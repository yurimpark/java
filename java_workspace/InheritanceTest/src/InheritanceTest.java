class Person {
	public String name;
	public void speak() {System.out.println("speak");}
	public void eat() {System.out.println("�Դ�");}
	public void walk() {System.out.println("walk");}
	public void sleep() {System.out.println("�ڴ�");}
}
class Student extends Person {
	public void study() {System.out.println("�����ϴ�");}
}
class Studentworker extends Student {
	public void work() { System.out.println("work");}
}
class Researcher extends Studentworker {
	public void research() {System.out.println("research");}
}
class Professor extends Researcher {
	public void teach() {System.out.println("teach");}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Person p=new Person();
		p.name="ȫ�浿";
		System.out.println(p.name);
		Student s= new Student();
		s.name="�̼���";
		System.out.println(s.name);
		s.study();
		s.eat();
		Studentworker sw=new Studentworker();
		sw.name="�հ�";
		sw.eat();
		sw.sleep();
		System.out.println(sw.name);
		Researcher r=new Researcher();
		r.name="������";
		r.work();
		r.eat();
		r.speak();
		System.out.println(r.name);
		Professor pr= new Professor();
		pr.name="��Ź��";
		pr.eat();
		pr.sleep();
		System.out.println(pr.name);

	}

}
