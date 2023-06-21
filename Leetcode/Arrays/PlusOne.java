/*
 * 
 * 
 * 
 * 
 * 
 * 66. Plus One
Easy
7.5K
5K
Companies
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.




 */

class Solution {
    public int pow(int n, int x){
        int mul=1;
        for(int i=0 ; i<n ; i++){
            mul*=10;
        }
        return x*mul;
    }

    public int [] generateArray(int x, int[]nums){
        int rem=0, i=nums.length-1;
         System.out.println(x);
        while(x>0){
            rem=x%10;
            nums[i]=rem;
            x=x/10;
            i--;
        }
        return nums;
    }
    
    
    public int[] plusOne(int[] digits) {
        int sum = 0;
        for(int i=0; i<digits.length; i++){
            sum+=pow(digits.length-i-1, digits[i]);
        }
        sum+=1;
        String str = Integer.toString(sum);
        int [] nums = new int [str.length()];
        return generateArray(sum, nums);
    }
}