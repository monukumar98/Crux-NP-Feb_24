package Lec34;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_Level_Order {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node node = new Node();
		node.val = item;
		root = node;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			Node rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node nn = new Node();
				nn.val = c1;
				rv.left = nn;
				q.add(nn);
			}
			if (c2 != -1) {
				Node nn = new Node();
				nn.val = c2;
				rv.right = nn;
				q.add(nn);
			}
		}
		return root;

	}

	public static void main(String[] args) {
		Create_Tree_Using_Level_Order cl = new Create_Tree_Using_Level_Order();

	}
}
