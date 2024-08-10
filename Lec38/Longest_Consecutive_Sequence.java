package Lec38;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
	}

	public static int Longest_Consecutive(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			if (map.containsKey(val - 1)) {
				map.put(val, false);
			} else {
				map.put(val, true);
			}
			if (map.containsKey(val + 1)) {
				map.put(val + 1, false);
			}
		}
		int ans = 0;
		for (int key : map.keySet()) {
			if (map.get(key)) {
				int c = 0;
				while (map.containsKey(key)) {
					c++;
					key++;
				}
				ans=Math.max(ans, c);

			}
		}
		return ans;
	}
}



