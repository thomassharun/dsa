package dsa.roadmap.twopointer;

public class TwoSum_SortedArray {

	public static void main(String args[]) {

		int nums[] = { 1, 3, 5, 7, 8, 10, 12, 14, 16, 20 };
		int sum = 18;
		int right = nums.length - 1;
		int left = 0;
		int result[] = new int[2];
		for (int i = 0; left < (nums.length); i++) {
			if (nums[left] + nums[right] > sum) {
				right--;
			} else if (nums[left] + nums[right] < sum) {
				left++;
			} else if (nums[left] + nums[right] == sum) {
				result[0] = left;
				result[1] = right;
				break;
			}

		}
		System.out.println(nums[result[0]] + "+" + nums[result[1]]);

	}

}
