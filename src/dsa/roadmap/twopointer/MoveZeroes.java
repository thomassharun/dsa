package dsa.roadmap.twopointer;

public class MoveZeroes {

	public static void main(String args[]) {

		// i iterates through each element - j will stop at first zero and swap values and j++
		int nums[] = {1,2,3,4,4, 0,0,0, 10, 0, 1, 0, 3, 12 };
		int j = 0;
		int temp = 0;
		for (int i = 0; i < (nums.length); i++) {
			if ( nums[i] != 0) {

				// swap
				System.out.println("Swap b/w " + i + "th Element: " + nums[i] + " and " + j + "th Element: " + nums[j]);
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
			
		}
		for (int i = 0; i < (nums.length); i++) {
			System.out.print(nums[i] + ", ");
		}
	}

}
