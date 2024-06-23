package Lec29;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addatindex(-9, 2);
		ll.Display();
		System.out.println(ll.getatindex(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		//System.out.println(ll.removeFirst());
		//System.out.println(ll.removeLast());
		System.out.println(ll.removeatindex(2));
		ll.Display();
	}

}
