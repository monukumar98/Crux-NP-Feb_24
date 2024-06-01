package Lec25;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Ankit", 22);
//		System.out.println(s.name);
//		System.out.println(s.age);
//		s.name="Kamlesh";
//		s.age=-18;
//		System.out.println(s.name);
//		System.out.println(s.age);
		s.setAge(-19);
		// System.err.println("hello");
		System.out.println(s.getAge());
		System.out.println("hey");

	}

}
