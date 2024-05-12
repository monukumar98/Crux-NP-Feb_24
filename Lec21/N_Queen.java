package Lec21;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		NQueen(board, n, 0);

	}

	public static void NQueen(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col) == true) {
				board[row][col] = true;
				NQueen(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// left diagonal
		int r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		// Up
		r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		return true;

	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
