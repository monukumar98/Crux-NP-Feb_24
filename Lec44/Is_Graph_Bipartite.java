package Lec44;

import java.util.*;



public class Is_Graph_Bipartite {
	public boolean isBipartite(int[][] graph) {
		Queue<BipartitePair> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();
		for (int src = 0; src < graph.length; src++) {
			if (visited.containsKey(src)) {
				continue;
			}
			q.add(new BipartitePair(src, 0));
			while (!q.isEmpty()) {
				// 1. remove
				BipartitePair rv = q.poll();

				// 2. Ignore if already visited
				if (visited.containsKey(rv.vtx)) {
					if (visited.get(rv.vtx) != rv.dis) {
						return false;
					}
					continue;
				}

				// 3.marked visited
				visited.put(rv.vtx, rv.dis);

				// 5. add unvisited nbrs
				for (int nbrs : graph[rv.vtx]) {
					if(!visited.containsKey(nbrs)) {
						q.add(new BipartitePair(nbrs, rv.dis+1));
					}

				}
			}
		}
		return true;
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int v, int d) {
			// TODO Auto-generated constructor stub
			this.vtx = v;
			this.dis = d;
		}
	}

}
