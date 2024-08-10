package Lec39;

import java.util.HashMap;
import java.util.Scanner;

public class Tries_Contacts {
	class Node {
		char val;
		HashMap<Character, Node> chlid = new HashMap<>();
		boolean isterminal;
		int count = 1;
	}

	private Node root;

	public Tries_Contacts() {
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
				curr.count++;
			} else {
				Node n = new Node();
				n.val = ch;
				curr.chlid.put(ch, n);
				curr = n;
			}
		}
		curr.isterminal = true;
	}

	public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.chlid.containsKey(ch)) {
				curr = curr.chlid.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Tries_Contacts t1 = new Tries_Contacts();
		while (t-- > 0) {
			String s = sc.next();
			String p = sc.next();
			if (s.equals("add")) {
				t1.insert(p);
			} else {
				System.out.println(t1.startsWith(p));
			}
		}
	}

}
