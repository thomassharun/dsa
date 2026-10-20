package dsa.roadmap.arraysandstrings;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String args[]) {

		String[] strs = { "flower", "flow", "flight" };

		Arrays.sort(strs);
		int minLength = 201;
		for (String i : strs) {
			if (i.length() < minLength) {
				minLength = i.length();
			}
		}
		System.out.println(minLength);

		String first = strs[0];
		String last = strs[strs.length - 1];
		String commonPrefix="";
		for(int i=0; i< minLength; i++) {
			if(first.charAt(i)==last.charAt(i)) {
				commonPrefix = commonPrefix+first.charAt(i);
			}else {
				break;
			}
			
		}
		System.out.println(commonPrefix);

	}
}
