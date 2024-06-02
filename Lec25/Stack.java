package Lec25;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean isEmpty() {
		return idx == -1;
	}

	// O(1)
	public boolean isfull() {
		return idx + 1 == arr.length;
	}

	// O(1)
	public int size() {
		return idx + 1;
	}

	// O(1)
	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("bklol client stack full hogya hai ");
		}
		idx++;
		arr[idx] = item;
	}

	// O(1)
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("bklol client stack Empty  hai ");
		}
		int v = arr[idx];
		idx--;
		return v;
	}

	// O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("bklol client stack Empty  hai ");
		}
		int v = arr[idx];

		return v;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

