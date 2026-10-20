package dsa.roadmap.arraysandstrings;

public class RotateArray {
	public static void main(String args[]) {
		// Rotate array K times
		int k = 3;
		int nums[] = { 20, 21, 22, 23, 24, 25, 26, 27 };
		int out[] = new int[nums.length];
		int mod = k % nums.length;
		System.out.println("mod" + mod);
		for (int i = 0; i < nums.length; i++) {

//			int newpos=mod+i;
//			if (newpos >= (nums.length)) {
//				newpos = mod - (nums.length - i);
//				System.out.println("TC" + newpos);
//			}
			
			int newpos = (i + mod) % nums.length;

			System.out.println("Existing pos:" + i + ": & new pos: " + newpos + " " + nums[i] + " ");
			out[newpos] = nums[i];
		}
		System.out.print("Out:");
		for (int i = 0; i < nums.length; i++) {

			nums[i] = out[i];
			System.out.print(nums[i]+" ");
		}
		// }

	}
}
