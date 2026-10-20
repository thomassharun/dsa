package dsa.basics;

public class A2_ArrayAddition {
	
	public static void main(String[] args) {
		int ar1[] = {2, 3, 5, 2, 18};
		int ar2[] = {10, 20};
		int sum = 0;
		int len = ar1.length>ar2.length?ar1.length:ar2.length;

		for (int i=0; i<len; i++) {
			if(ar2.length<=i)
			sum+=ar1[i];
			else if(ar1.length<=i)
				sum+=ar2[i];
			else
				sum+=ar1[i]+ar2[i];
		}
		System.out.println(sum);
	}
	
}
