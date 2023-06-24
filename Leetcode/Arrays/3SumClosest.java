// 16. 3Sum Closest
// Medium
// 9.3K
// 484
// Companies
// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

// Constraints:

// 3 <= nums.length <= 500
// -1000 <= nums[i] <= 1000
// -104 <= target <= 104

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int cSum = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        if(nums.length<0){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    cSum = sum;
                    break;
                }
                if(Math.abs(target-sum)<Math.abs(target-cSum)){
                    cSum=sum;
                }
                if(target<sum){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return cSum;
    }
}