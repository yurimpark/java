class Person {
	public String name;
	public void speak() {System.out.println("speak");}
	public void eat() {System.out.println("¸Ô´Ù");}
	public void walk() {System.out.println("walk");}
	public void sleep() {System.out.println("ÀÚ´Ù");}
}
class Student extends Person {
	public void study() {System.out.println("°øºÎÇÏ´Ù");}
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
		p.name="È«±æµ¿";
		System.out.println(p.name);
		Student s= new Student();
		s.name="ÀÌ¼ø½Å";
		System.out.println(s.name);
		s.study();
		s.eat();
		Studentworker sw=new Studentworker();
		sw.name="¿Õ°Ç";
		sw.eat();
		sw.sleep();
		System.out.println(sw.name);
		Researcher r=new Researcher();
		r.name="À¯°ü¼ø";
		r.work();
		r.eat();
		r.speak();
		System.out.println(r.name);
		Professor pr= new Professor();
		pr.name="±èÅ¹±¸";
		pr.eat();
		pr.sleep();
		System.out.println(pr.name);

	}

}
