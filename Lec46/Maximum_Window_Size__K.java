package Lec46;

public class Maximum_Window_Size__K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 51, 7, 8, 5, 2, 3, 4 };
		int k = 3;
		System.out.println(Maximum_Window(arr, k));
	}

	public static int Maximum_Window(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum = sum + arr[i];// window grow
			sum = sum - arr[i - k];// window shrink
			ans = Math.max(ans, sum);// ans update
		}
		return ans;
	}

}
