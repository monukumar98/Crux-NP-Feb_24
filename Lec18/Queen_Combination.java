package Lec18;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		boolean[] board = new boolean[n];
		Combination(board, k, "", 0,0);

	}

// tq --> total queen
	public static void Combination(boolean[] board, int tq, String ans, int qpsf,int idx) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Combination(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1,i+1);
				board[i] = false;// backtraking
			}
		}
	}

}
