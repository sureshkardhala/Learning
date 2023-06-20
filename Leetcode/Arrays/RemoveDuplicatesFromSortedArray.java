class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,k=0;
        if(nums.length <=1){
            return nums.length;
        }
        for(i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                nums[++k]=nums[i];
            }
        }
        return k+1;
    }
}