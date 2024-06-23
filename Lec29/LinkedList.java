package Lec29;

public class LinkedList {
	private class Node {
		int val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addFirst(int item) {
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
	public void addLast(int item) {

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
	public void addatindex(int item, int k) throws Exception {
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
	public int getFirst() {
		return head.val;
	}

	// O(1)
	public int getLast() {
		return tail.val;
	}

	// O(N)
	public int getatindex(int k) throws Exception {
		return getNode(k).val;
	}

	// O(1)
	public int removeFirst() {
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
	public int removeLast() throws Exception {
		if (size == 1) {
			return removeFirst();
		} else {
			Node prev = getNode(size - 2);
			int val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}

	}

	// O(N)
	public int removeatindex(int k) throws Exception {
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

}
