package Lec35;

public class Pair<T, P> {
	T x;
	P y;

	@Override
	public String toString() {
		return x + " " + y;
	}

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>();
		p1.x = "Kaju";
		p1.y = 29;
		Pair<Integer, Boolean> p2 = new Pair<>();
		p2.x = 1;
		p2.y = true;
		System.out.println(p1);
		System.out.println(p2);
	}

}
