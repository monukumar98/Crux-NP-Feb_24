package Lec34;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
		}

		public TreeNode CreateTree(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			TreeNode nn = new TreeNode(pre[plo]);
			int idx = search(in, ilo, ihi, pre[plo]);
			int noe = idx - ilo;
			nn.left = CreateTree(pre, in, plo + 1, plo + noe, ilo, idx - 1);
			nn.right = CreateTree(pre, in, plo + noe + 1, phi, idx + 1, ihi);
			return nn;
		}

		public int search(int[] in, int si, int ei, int ele) {
			for (int i = si; i < ei; i++) {
				if (in[i] == ele) {
					return i;
				}
			}
			return -1;
		}
	}

}
