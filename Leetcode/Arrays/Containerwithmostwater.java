/*
 * 
 * 
 * 
 * 
 * 11. Container With Most Water
Medium
24.8K
1.3K
Companies
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */


 class Solution {
    
    public int minElement(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }

    public int maxArea(int[] height) {
        int r=height.length-1,max=0;
        for(int i=0; i<height.length-1; i++){
            int  top=r;
            while(top-i>0){
                int min = minElement(height[i], height[top]);
                int val=min*(top-i);
                if(max<val){
                    max=val;
                }
                top--;
            }
        }
        return max;
    }
}

//O(n) complexity Best solution 
class Solution2 {
    public int maxArea(int[] height) {
        int h=height.length;
        int left=0, right=h-1, max=0;
        while(left<right){
            int area = (right-left)*Math.min(height[left], height[right]);
            if(max<area){
                max=area;
            }
            if(height[right]<height[left]){
                right--;
            } else{
                left++;
            }
        }
        return max;
    }
} 