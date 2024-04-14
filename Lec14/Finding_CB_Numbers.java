package Lec14;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Count(String s) {
		int c = 0;
		boolean [] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);
				if (isCbnumber(Long.parseLong(str)) == true && isvisited(visited,i,j-1)==true) {
					//marked
					for (int k = i; k <=j-1; k++) {
						visited[i]=true;
					}
					c++;
				}

			}
		}
		return c;

	}

	public static boolean isvisited(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for (int i = si; i <=ei; i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;
		
	}

	public static boolean isCbnumber(long n) {

		if (n == 0 || n == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
