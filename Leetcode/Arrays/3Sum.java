// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
 

// Constraints:

// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105

//O(n^2) Time complexity
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Set<List<Integer>> resSet = new HashSet<>();
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<len; i++){
            int j=i+1, k=len-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List<Integer> arrList = new ArrayList<>();
                    arrList.add(nums[i]);
                    arrList.add(nums[j]);
                    arrList.add(nums[k]);
                    resSet.add(arrList);
                    j++;
                    k--;
                }
                if(sum<0){
                    j++;
                }
                if(sum>0){
                    k--;
                }
            }
        }
        for(List l : resSet){
            resList.add(l);
        }
        return resList;
    }
}