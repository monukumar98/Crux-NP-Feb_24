package Lec14;

import java.util.ArrayList;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 1, 5 };
		int[] arr2 = { 6, 7, 8, 9, 8 };
		SumofArray(arr1, arr2);

	}

	public static void SumofArray(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0;
		int i=arr1.length-1;
		int j=arr2.length-1;
		while(i>=0 && j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			list.add(sum%10);
			carry=sum/10;
			i--;
			j--;
		}
		while(i>=0 ) {
			int sum=arr1[i]+carry;
			list.add(sum%10);
			carry=sum/10;
			i--;
		}
		while( j>=0) {
			int sum=arr2[j]+carry;
			list.add(sum%10);
			carry=sum/10;
			j--;
		}
		if(carry!=0) {
			list.add(carry);
		}
		for (int k = list.size()-1; k>=0; k--) {
			System.out.print(list.get(k)+", ");
		}
		System.out.println("END");
	}
	
	
	
	
	
	
	

}
