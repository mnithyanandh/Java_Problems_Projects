// Given an array of integers "nums" and an integer "target", return indices of the two numbers such that they add up to "target".
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

/* 
* Example 1:
* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Output: Because nums[0] + nums[1] == 9, we return [0, 1]. */

/* 
* Example 2:
* Input: nums = [3,2,4], target = 6
* Output: [1,2]. */

/* 
* Example 3:
* Input: nums = [3,3], target = 6
* Output: [0,1]. */

public class TwoSum {
	public static int[] twoSum(int[]nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[j] == target - nums[i]) {
					System.out.println(nums[i] +"," + nums[j]);
					return new int[] {i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution found");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a[] = {2,7,11,15};
		int b[] = {3,2,4};
		int c[] = {3,3};
		
		/* Following are the function call statements. Un-comment to view execution pass/fail criteria for corresponding examples. */
		//1. twoSum(a, 9);
		//2. twoSum(b, 6);
		//3. twoSum(c, 6);
	}
}