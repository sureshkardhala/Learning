// 18. 4Sum
// Medium
// 9.6K
// 1.1K
// Companies
// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]
 

// Constraints:

// 1 <= nums.length <= 200
// -109 <= nums[i] <= 109
// -109 <= target <= 109

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> resSet = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length - 1;
        List<List<Integer>> list2 = new ArrayList<>();

        for (int i = 0; i < len - 2; i++) {
            for (int l = len; l > i + 2; l--) {
                int j = i + 1, k = l - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        list1.add(nums[l]);
                        resSet.add(list1);
                        j++;
                        k--;
                    }
                    if (sum < target) {
                        j++;
                    }
                    if (sum > target) {
                        k--;
                    }
                }
            }
        }
        for (List<Integer> a : resSet) {
            list2.add(a);
        }
        return list2;
    }
}
