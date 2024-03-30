package Lec9;

public class Maximum_SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -6, 4, -1, 7 };
		System.out.println(Max_Sum(arr));

	}
	public static int Max_Sum(int []arr) {
		int ans=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int curr_sum=0;
			for (int j = i; j < arr.length; j++) {
				curr_sum+=arr[j];
				ans=Math.max(ans, curr_sum);
			}
		}
		return ans;
	}

}
