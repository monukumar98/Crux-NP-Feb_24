package Lec14;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 19;
		int a1 = 18;
		System.out.println(a);
		System.out.println(a1);
		Long l = 12l;
		System.out.println(l);
		Character ch = 'a';
		// auto-Boxing
		a = a1;
		// Un-Boxing
		int x = 9;
		Integer y = 90;
		x = y;
		Integer b1 = 17;
		Integer b2 = 17;
		Integer b3 = 170;
		Integer b4 = 170;
		System.out.println(b1 == b2);
		System.out.println(b3 == b4);
		Boolean b5 = true;
		Boolean b6 = true;
		System.out.println(b5 == b6);
		Character ch1 = '9';
		Character ch2 = '9';
		System.out.println((int)(ch1));
		System.out.println(ch1 == ch2);
	}

}











