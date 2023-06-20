import java.util.ArrayList;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>arrList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                arrList.add(Integer.valueOf(nums[i]));
            }
        }
        int i=0;
        for(Integer a : arrList){
            nums[i] = a;
            i++;
        }
        return i;
    }
}