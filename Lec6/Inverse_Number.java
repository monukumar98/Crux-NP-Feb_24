package Lec6;

import java.util.Scanner;

public class Inverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Invsere(n));

	}

	public static int Invsere(int n) {
		int sum = 0;
		int place = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + place * Math.pow(10, rem - 1));
			place++;
			n = n / 10;
		}
		return sum;
	}

}
