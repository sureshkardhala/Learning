/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4 */




//O(1) time complexity
class Solution {

    public int bSearch(int []nums, int l, int r, int target){
        if(r>=l){
            int mid= l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                return bSearch(nums, l, mid-1, target);
            }
            return bSearch(nums, mid+1, r, target);
        }
        return r+1;
    }

    public int searchInsert(int[] nums, int target) {
        return bSearch(nums, 0, nums.length-1, target);
    }
}

//O(n) timecomplexity
class Solution2 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            } 
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}