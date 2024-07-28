package Lec35;

public class Flatten_Binary_Tree_to_Linked_List {
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
		public void flatten(TreeNode root) {
			MakeLL(root);
		}

		public TreeNode MakeLL(TreeNode root) {
			if (root == null) {
				return null;
			}
			if (root.left == null && root.right == null) {
				return root;
			}
			TreeNode leftll_Tail = MakeLL(root.left);
			TreeNode rightll_Tail = MakeLL(root.right);
			if (leftll_Tail != null) {
				leftll_Tail.right = root.right;
				root.right = root.left;
				root.left = null;
			}
			return rightll_Tail == null ? leftll_Tail : rightll_Tail;

		}
	}

}
