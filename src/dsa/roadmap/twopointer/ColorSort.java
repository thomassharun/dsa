package dsa.roadmap.twopointer;

public class ColorSort {

	public static void main(String args[]) {
		int nums[] = { 2, 0, 2, 1, 1, 0 };
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		System.out.print("Input: ");
		for (int i = 0; i < nums.length; i++) {
			
			System.out.print(nums[i]+" ");
			if (nums[i] == 0) {
				zeroCount++;
			}
			if (nums[i] == 1) {
				oneCount++;
			}
			if (nums[i] == 2) {
				twoCount++;
			}
		}
		System.out.println();
		System.out.print("Output: ");
		for (int i = 0; i < nums.length; i++) {
			if (zeroCount != 0) {
				nums[i] = 0;
				zeroCount--;
			} else if (oneCount != 0) {
				nums[i] = 1;
				oneCount--;
			} else {
				nums[i] = 2;
				twoCount--;
			}
			System.out.print(nums[i]+" ");
		}
		
	}

}
