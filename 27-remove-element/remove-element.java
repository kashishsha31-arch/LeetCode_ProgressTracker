class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next valid element position
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the valid element forward
                k++; // Move the pointer
            }
        }
        
        return k; // Return the count of elements not equal to val
    }
}