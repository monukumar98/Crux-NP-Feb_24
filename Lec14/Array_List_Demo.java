package Lec14;

import java.util.ArrayList;

public class Array_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		// size
		System.out.println(ll.size());
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, -9);// O(N)
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));// 0 to size O(1)
		System.out.println(ll);
		// remove O(N)
		System.out.println(ll.remove(1));
		System.out.println(ll);
		ll.add(201);
		ll.add(-918);
		System.out.println(ll);
		// update O(1)
		ll.set(2, -11);
		System.out.println(ll);

	}

}


