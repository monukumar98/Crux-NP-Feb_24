package Lec46;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabaaababababbabbabaaaaaaaaa";
		int k = 2;
		int flipa = Flipchar(str, k, 'a');
		int flipb = Flipchar(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int Flipchar(String str, int k, char ch) {
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < str.length()) {
			// grow
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrink
			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}

			// ansupdate
			ans = Math.max(ans, ei - si + 1);

			ei++;
		}
		return ans;
	}

}
