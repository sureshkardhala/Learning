/**
 

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

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
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?






 */




class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int a : nums){
            arrList.add(Integer.valueOf(a));
        }
        Set<Integer> arr1 = new HashSet<>();
        Integer count=1;
        for(Integer a : arrList){
            Integer reqVal = Integer.valueOf(target) - a;
            List<Integer> subbList = arrList.subList(count, arrList.size());
            if(subbList.contains(reqVal)){
                arr1.add(Integer.valueOf(arrList.indexOf(a)));
                arr1.add(count + Integer.valueOf(subbList.indexOf(reqVal)));
                break;
            }
            count++;
        }
        int [] res = new int [2];
        Integer[] array = new Integer[2];
        arr1.toArray(array);
        for(int i=0; i<2; i++){
            res[i]= array[i];
        }
        return res;
    }
}