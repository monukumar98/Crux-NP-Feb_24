package Lec39;

import java.util.HashMap;

public class Trie {
	class Node {
		char val;
		HashMap<Character, Node> chlid = new HashMap<>();
		boolean isterminal;
	}

	private Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		Node n = new Node();
		n.val = '*';
		root = n;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				Node n = new Node();
				n.val = ch;
				curr.chlid.put(ch, n);
				curr = n;
			}
		}
		curr.isterminal = true;
	}

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return false;
			}
		}
		return curr.isterminal;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("raj");
		t.insert("rajesh");
		t.insert("ankit");
		t.insert("ankita");
	}
}
