/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

public class TwoSum_App {
    public static void main(String[] args) throws Exception {
        
        Solution solution = new Solution();
        int[] nums = {2, 47, 11, 7};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            // cur + x = target
            // x = target - cur
            int x = target - nums[i];
            for(int j = 0; j < nums.length; j++){
                // if the x == num and it is not the same number
                if(x == nums[j] && j != i){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}