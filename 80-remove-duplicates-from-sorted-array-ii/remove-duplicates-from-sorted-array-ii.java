class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array has 2 or fewer elements, no duplicates can violate the rule
        if (nums.length <= 2) {
            return nums.length;
        }
        
        // This pointer tracks the position where the next valid element should go
        int index = 2; 
        
        // Start scanning from the third element (index 2)
        for (int i = 2; i < nums.length; i++) {
            // Compare the current element with the element two steps behind our write pointer
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++; // Move the write pointer forward
            }
        }
        
        // The index will represent the length of the modified valid array
        return index;
    }
}