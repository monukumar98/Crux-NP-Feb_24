package Lec1;

public class Inc_Dec_Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
//		System.out.println(x++);6
//		System.out.println(x);7
//		int c = x++ - x-- + 8 + x++ + x--;
//		System.out.println(c);//20
//		System.out.println(--x);//5
//		System.out.println(x);//5
		int c = x++ + ++x - --x - ++x + x++ + 8 + x--;
		System.out.println(c);

	}

}
