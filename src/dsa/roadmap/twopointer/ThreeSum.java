package dsa.roadmap.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String args[]) {

		// int nums[] = { -4, -1, -1, 0, 1, 2, 3, -2, 5, -3 };

		int nums[] = { -1, 0, 1, 2, -1, -4 };

		for (int i : nums) {
			System.out.print(i + " ");
		}

		Arrays.sort(nums);

		List<List<Integer>> set = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			// skip if current i-th value is same as previous i-th value. we could have done
			// i++ -> but its already a for-loop with i++, so just skip
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					System.out.println("\nFound : " + nums[i] + " " + nums[left] + " " + nums[right]);
					set.add(Arrays.asList(nums[i], nums[left], nums[right]));

					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (sum < 0) {
					left++;
				} else if (sum > 0) {
					right--;
				}

			}
		}
	}
}
