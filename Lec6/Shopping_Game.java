package Lec6;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int a = sc.nextInt();
			int h = sc.nextInt();
			Winner(a, h);
			t--;
		}
	}

	public static void Winner(int a, int h) {
		int ca = 0;
		int ch = 0;
		int phone = 1;
		while (true) {
			ca += phone;
			if (ca > a) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			ch += phone;
			if (ch > h) {
				System.out.println("Aayush");
				break;
			}
			phone++;
		}
	}

}
