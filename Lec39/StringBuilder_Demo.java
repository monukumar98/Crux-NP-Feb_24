package Lec39;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("hello");
		sb.append(1);
		sb.append('a');
		sb.append(true);

		System.out.println(sb);
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.charAt(3));
		System.out.println(sb.length());
		sb.append("Hello");
		sb.append(1);
		System.out.println(sb.capacity());// 2*oldcapacity+2
		System.out.println(sb.length());
		String s=sb.toString();// builder to String
		StringBuilder sb1 = new StringBuilder(s);// string to bulider
	}

}
