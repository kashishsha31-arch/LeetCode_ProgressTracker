class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < n) {
            sum += nums[j];              // add the entering element

            if (j - i + 1 == k) {        // window has reached size k
                maxSum = Math.max(maxSum, sum);
                sum -= nums[i];          // remove the leaving element
                i++;
            }
            j++;
        }
        return (double) maxSum / k;
    }
}