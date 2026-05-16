import java.util.Arrays;

class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        
        // The maximum n value is len - 1 since from ques we know l=n+1 for our base case given array
        int n = len - 1;
        
        //for our case of 1
        if (len < 2) return false; 

        // Check if elements from 0 to n-1 match 1 to n
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        
        //last elemnet handled seperately
        return nums[len - 1] == n;
    }
}