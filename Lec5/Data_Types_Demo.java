package Lec5;

import java.util.Scanner;

public class Data_Types_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte b = (byte) (432);
		byte b = -5;
		int x = 7;
		long l = 9867868671l;
		short s = 15;
		x = b;
		System.out.println(b);
		System.out.println(x);
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		l=sc.nextLong();
		b=sc.nextByte();
		s=sc.nextShort();
	}

}
