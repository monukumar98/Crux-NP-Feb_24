package Lec34;

public interface StackI {

	public void push(int item);

	public int pop();

	int val = 9;

//java 8
	static void display() {

	}

	default void display1() {

	}

	// java 9
	private void display3() {

	}
}
