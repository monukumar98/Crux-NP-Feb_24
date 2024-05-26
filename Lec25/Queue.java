package Lec25;

public class Queue {
	private int[] arr;
	private int front = 0;
	private int size = 0;

	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean isEmpty() {
		return size == 0;
	}// O(1)

	public boolean isfull() {
		return size == arr.length;
	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Queue full hai ");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;
	}

	// O(1)
	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue Empty hai ");
		}
		int v = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return v;
	}

	// O(1)
	public int getfornt() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue Empty hai ");
		}
		int v = arr[front];

		return v;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

}
