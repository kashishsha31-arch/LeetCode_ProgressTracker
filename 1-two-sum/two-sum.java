class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hashmap 
        
        HashMap <Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           if(map1.containsKey(target-nums[i]))
           {
              return new int []{map1.get(target-nums[i]),i};
           }
           
              map1.put(nums[i],i);
            }
        return null;



        }
    }
