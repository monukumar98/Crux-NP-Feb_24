package Lec27;

public class Student {

	String name = "Kaju";
	int age = 19;

	@Override
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		s1.name = "raju";
		System.out.println(s);
		System.out.println(s1);
	}

}
