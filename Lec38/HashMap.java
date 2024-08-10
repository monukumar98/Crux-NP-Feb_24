package Lec38;

import java.util.ArrayList;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	private int size = 0;
	ArrayList<Node> bukt;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	public void put(K key, V value) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = bukt.get(idx);
		Node node = new Node();
		node.key = key;
		node.value = value;
		node.next = temp;
		bukt.set(idx, node);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / bukt.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> newbukt = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			newbukt.add(null);
		}
		ArrayList<Node> oba = bukt;
		bukt = newbukt;
		for (Node temp : oba) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}

	}

	@Override
	public String toString() {
		String s = "{";

		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ", ";
				temp = temp.next;
			}
		}

		return s + "}";
	}

	public boolean containsKey(K key) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V reomove(K key) {
		int idx = Hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			bukt.set(idx, curr.next);
			size--;
		} else {
			prev.next = curr.next;
			size--;
		}
		return curr.value;
	}

	public int Hashfun(K key) {
		int bn = key.hashCode() % bukt.size();
		if (bn < 0) {
			bn += bukt.size();
		}
		return bn;
	}
}
