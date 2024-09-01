package Lec45;

import java.util.*;

public class Topological_Sort {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Topological_Sort(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2) {
		map.get(v1).put(v2, 0);

	}

	public int[] indegree() {
		int[] in = new int[map.size()];
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				in[v2]++;
			}
		}
		return in;

	}

	public void TopologicalSort() {
		Queue<Integer> q = new LinkedList<>();
		int[] in = indegree();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int rv = q.poll();
			System.out.print(rv + " ");
			for (int nbrs : map.get(rv).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		System.out.println();
	}

	public boolean Iscycle() {
		Queue<Integer> q = new LinkedList<>();
		int[] in = indegree();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int count = 0;
		while (!q.isEmpty()) {
			int rv = q.poll();
			count++;
			for (int nbrs : map.get(rv).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		if (count < map.size()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Topological_Sort ts = new Topological_Sort(8);
		ts.addedge(1, 2);
		ts.addedge(1, 0);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
		ts.addedge(5, 7);
		ts.addedge(6, 3);
		ts.addedge(6, 7);
		ts.TopologicalSort();
	}

}
