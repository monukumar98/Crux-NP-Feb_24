package Lec36;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Heap hp = new Heap();
		PriorityQueue<Integer> hp = new  PriorityQueue<>(Collections.reverseOrder());
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
		System.out.println(hp.peek());
		System.out.println(hp.remove());
		System.out.println(hp);
	}

}
