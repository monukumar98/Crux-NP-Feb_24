package Lec37;

import java.util.*;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(2);
		set.add(21);
		set.add(11);
		set.add(-2);
		set.add(7);
		set.add(9);
		set.add(3);
		set.add(5);
		set.add(-32);
		System.out.println(set);
//		System.out.println(set.contains(11));
//		System.out.println(set.contains(-11));
//		System.out.println(set.remove(11));
//		System.out.println(set.remove(-11));
//		System.out.println(set);
//		for (int v : set) {
//			System.out.print(v + " ");
//		}
//		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(2);
		set1.add(21);
		set1.add(11);
		set1.add(-2);
		set1.add(7);
		set1.add(9);
		set1.add(3);
		set1.add(5);
		set1.add(-32);
		set1.add(5);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(2);
		set2.add(21);
		set2.add(11);
		set2.add(-2);
		set2.add(7);
		set2.add(9);
		set2.add(3);
		set2.add(5);
		set2.add(-32);
		System.out.println(set2);
	}

}











