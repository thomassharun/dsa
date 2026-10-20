package dsa.roadmap.arraysandstrings;

public class ReverseArray {
	public static void main(String args[]) {

		int[] nums= {1,2,3,4,5,6,7};
		int right=nums.length-1;
		for(int i=0; i<(nums.length/2); i++) {
			int temp=nums[i];
			nums[i]=nums[right];
			System.out.println("swapping "+i+" and "+right);
			nums[right]=temp;
			right--;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]);
		}


	}
}
