class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap <Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
          if(map.containsKey(target-nums[i]))
          {
              return new int []{map.get(target-nums[i]),i}; // filling array with 2 values, the nums[i] got from map and another index of it 
          }
          
            
            map.put(nums[i],i);// adding the element to hashmap
            
       }
       return null;
}
}