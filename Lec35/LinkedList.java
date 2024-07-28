package Lec35;
public class LinkedList<T> {
	private class Node {
		T val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addLast(T item) {

		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// O(N)
	public void addatindex(T item, int k) throws Exception {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("bklol k glt hai");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(1)
	public T getFirst() {
		return head.val;
	}

	// O(1)
	public T getLast() {
		return tail.val;
	}

	// O(N)
	public T getatindex(int k) throws Exception {
		return getNode(k).val;
	}

	// O(1)
	public T removeFirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;
	}

	// O(N)
	public T removeLast() throws Exception {
		if (size == 1) {
			return removeFirst();
		} else {
			Node prev = getNode(size - 2);
			T val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}

	// O(N)
	public T removeatindex(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = getNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Kaju");
		ll.addLast("Ankita");
		ll.addLast("Ankit");
		ll.addLast("Raj");
		ll.Display();
	}

}







