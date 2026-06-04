class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Get the current count of nums[i] (default to 0 if not seen yet) and add 1
            int currentCount = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], currentCount);
            
            // Per the problem description, the majority element appears MORE than n / 2 times
            if (currentCount > n / 2) {
                return nums[i];
            }
        }
        
        return -1;
    }
}