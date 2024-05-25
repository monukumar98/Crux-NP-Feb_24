package Lec24;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Person p = new Person("Ankit", 29);
		System.out.println(p.age);
		p.name = "Anku";
		System.out.println(p.name);
		Person p1 = new Person("Ankita", 29);
		p.age=-9;

	}

}
