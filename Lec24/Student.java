package Lec24;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		String name = "Kunal";
		System.out.println("My Name is " + this.name + " and age is " + age);

	}

	public void SayHey(String name) {
		System.out.println(this.name + " Say hey " + name);
	}

	public static void Mentor_Name() {
		System.out.println("Monu Bhaiya");
	}

	static {
		System.out.println("Student1");
	}
	static {
		System.out.println("Student2");
	}
}
