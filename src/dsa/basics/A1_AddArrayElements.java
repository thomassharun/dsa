package dsa.basics;

public class A1_AddArrayElements {
	
	public static void main(String[] args) {
		int array[] = {2, 3, 5, 2, 18};
		int sum = 0;

		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		System.out.println(sum);
	}
	
}
