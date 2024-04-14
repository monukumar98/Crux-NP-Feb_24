package Lec14;

import java.util.ArrayList;

public class Array_list_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>(100);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();

		int[] arr = new int[6];

		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
			v = 0;
		}
	}

}






