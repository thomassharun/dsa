package dsa.roadmap.twopointer;

public class LongestPalindromicSubstring {
	public static void main(String args[]) {
		String s = "malayalamasraceeieecar";
		int len = s.length();
		int maxlen = 0;
		int oddresultIndex[] = null;
		int evenresultIndex[] = null;
		int startIndex = 0;
		for (int i = 0; i < len; i++) {
			int oddTmp = 0;
			int evenTmp = 0;
			// you need to check both centers at every index because the longest palindrome
			// can be either odd or even in length, regardless of the index.
			oddresultIndex = expand(s, i, i);
			evenresultIndex = expand(s, i, i + 1);

			oddTmp = oddresultIndex[1] - oddresultIndex[0];
			if (maxlen < oddTmp) {
				maxlen = oddTmp;
				startIndex = oddresultIndex[0];
			}
			
			evenTmp = oddresultIndex[1] - oddresultIndex[0];
			if (maxlen < evenTmp) {
				maxlen = evenTmp;
				startIndex = evenresultIndex[0];
			}
		}
		System.out.println(s.substring(startIndex, startIndex + maxlen+1));

	}

	static int[] expand(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
			left--;
			right++;
		}
		return new int[] { left + 1, right - 1 };
	}
}
