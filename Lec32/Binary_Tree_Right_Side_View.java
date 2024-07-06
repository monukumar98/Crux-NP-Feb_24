package Lec32;

import java.util.*;

public class Binary_Tree_Right_Side_View {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int max_Depth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			RightView(root, 1, ll);
			return ll;
		}

		public void RightView(TreeNode root, int curr, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (curr > max_Depth) {
				ll.add(root.val);
				max_Depth = curr;
			}
			RightView(root.right, curr + 1, ll);
			RightView(root.left, curr + 1, ll);
		}
	}

}




