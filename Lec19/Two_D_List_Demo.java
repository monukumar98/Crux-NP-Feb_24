package Lec19;

import java.util.ArrayList;
import java.util.List;

public class Two_D_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		System.out.println(ll);
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		ll.add(new ArrayList<>());
		ll.get(1).add(9);
		ll.get(1).add(91);
		ll.get(1).add(59);
		System.out.println(ll);
		System.out.println(ll.get(1).get(2));
		ll.add(new ArrayList<>());
		ll.get(3).add(4);

	}

}
