package Lec30;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		// stack
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		System.out.println(ll);
		System.out.println(ll.remove());// remove first
		// queue
		// LinkedList<Integer> q = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(10);// add last
		q.add(20);
		q.add(23);
		q.add(50);
		System.out.println(q);
		System.out.println(q.remove());

	}

}
