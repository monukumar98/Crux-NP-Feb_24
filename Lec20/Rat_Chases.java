package Lec20;

import java.util.*;

public class Rat_Chases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		Path(maze, 0, 0, ans);
		if (c == 0) {
			System.out.println("NO PATH FOUND");
		}
	}

	static int c = 0;

	public static void Path(char[][] maze, int cc, int cr, int[][] ans) {
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			Display(ans);
			c++;
			return;
		}
		int[] r = { -1, 0, 0, 1 };
		int[] c = { 0, -1, 1, 0 };
		for (int i = 0; i < c.length; i++) {
			Path(maze, cc + c[i], cr + r[i], ans);

		}
		
//		Path(maze, cc, cr - 1, ans);// up
//		Path(maze, cc - 1, cr, ans);// left
//		Path(maze, cc + 1, cr, ans);// right
//		Path(maze, cc, cr + 1, ans);// down
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
