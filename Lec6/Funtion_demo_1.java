package Lec6;

public class Funtion_demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a = 035;
		System.out.println("Hey");
		Add();// Fun calling
		System.out.println("Bye");
//		int b = 039;

	}

	public static void Add() {
		int a = 9;
		int b = 7;
		int c = a + b;
		Sub();
		System.out.println(c);
	}

	public static void Sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		System.out.println(c);
	}

}
