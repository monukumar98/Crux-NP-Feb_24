package Lec27;

public class Stack_Using_Queue {

	private Dynamic_Queue dq = new Dynamic_Queue();

	public boolean isEmpty() {
		return dq.isEmpty();
	}

	public int size() {
		return dq.size();
	}

	public void push(int item) throws Exception {
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (!dq.isEmpty()) {
			hlp.Enqueue(dq.Dequeue());
		}
		dq.Enqueue(item);
		while (!hlp.isEmpty()) {
			dq.Enqueue(hlp.Dequeue());
		}

	}

	public int pop() throws Exception {
		return dq.Dequeue();
	}

	public int peek() throws Exception {
		return dq.getfornt();
	}
}







