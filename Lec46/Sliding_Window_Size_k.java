package Lec46;

import java.util.*;
import java.util.LinkedList;

public class Sliding_Window_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,-1,-3,5,3,6,7 };
		int[] ans = maxWindow(arr, 3);
		 System.out.println(Arrays.toString(ans));

	}

	public static int[] maxWindow(int[] arr, int k) {
		int n = arr.length;
		int[] max = new int[n - k + 1];
		int j = 0;
		Deque<Integer> dq = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		max[j++] = arr[dq.getFirst()];
		for (int i = k; i < arr.length; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
			while (!dq.isEmpty() && dq.getFirst() <= i - k) {
				dq.removeFirst();
			}
			max[j++] = arr[dq.getFirst()];

		}
		return max;
	}

}
