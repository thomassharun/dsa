package dsa.roadmap.twopointer;

public class ValidPalindrome {
	
	public static void main(String args[]) {
		
		String test1 = "madam";
		String test2 = "noon";
		String test3 = "nooijoon";
		
		int right = test1.length()-1;
		boolean is_test1_palindrome = false;
		for (int i=0; i<(test1.length()/2); i++) {
			test1.charAt(i);
			
			if(test1.charAt(i) == test1.charAt(right)) {
				is_test1_palindrome = true;
			}else {
				is_test1_palindrome = false;
				break;
			}
			right--;
		}
		System.out.println(test1+" is palindrome: "+is_test1_palindrome);
		
		right = test2.length()-1;
		boolean is_test2_palindrome = false;
		for (int i=0; i<(test2.length()/2); i++) {
			test1.charAt(i);
			
			if(test2.charAt(i) == test2.charAt(right)) {
				is_test2_palindrome = true;
			}else {
				is_test2_palindrome = false;
				break;
			}
			right--;
		}
		System.out.println(test2+" is palindrome: "+is_test2_palindrome);
		
		right = test1.length()-1;
		boolean is_test3_palindrome = false;
		for (int i=0; i<(test1.length()/2); i++) {
			test1.charAt(i);
			
			if(test3.charAt(i) == test3.charAt(right)) {
				is_test3_palindrome = true;
			}else {
				is_test3_palindrome = false;
				break;
			}
			right--;
		}
		System.out.println(test3+" is palindrome: "+is_test3_palindrome);
		
	}

}
