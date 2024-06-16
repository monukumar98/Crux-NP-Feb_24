package Lec28;

import java.util.Stack;

public class Maximal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		int[][] matrix = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				matrix[i][j] = arr[i][j] - 48;
			}
		}
		int[] a = matrix[matrix.length - 1];
		int ans = Maximum_Area(a);
		for (int i = matrix.length - 2; i >= 0; i--) {
			for (int j = 0; j < matrix[0].length; j++) {
				a[j] = matrix[i][j] == 1 ? a[j] + 1 : 0;

			}
			ans = Math.max(ans, Maximum_Area(a));

		}
		System.out.println(ans);
	}

	public static int Maximum_Area(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					ans = Math.max(ans, h * r);
				} else {
					int l = st.peek();
					ans = Math.max(ans, h * (r - l - 1));
				}
			}
			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * r);
			} else {
				int l = st.peek();
				ans = Math.max(ans, h * (r - l - 1));
			}
		}
		return ans;

	}

}
