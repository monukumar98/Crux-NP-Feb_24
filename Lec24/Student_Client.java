package Lec24;

import java.util.ArrayList;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> list1 = new ArrayList<>();
		// ArrayList<Integer> list2 = new ArrayList<>()
		System.out.println("hey");
		Student s = new Student();
		s.name = "Kamlesh";
		s.age = 20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 21;
		s1.Intro_yourSelf();
		s1.SayHey("Raju");
		Student.Mentor_Name();
		// s.Mentor_Name();

	}

	static {
		System.out.println("Student client1");
	}

}
