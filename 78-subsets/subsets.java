class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       //trying my first recursion problem 
          
     List <List<Integer>> pr_set=new ArrayList<>();
     List <Integer> upr_set=new ArrayList<>();
      helper(0,nums,pr_set,upr_set);
      return pr_set;
}
    public void helper (int index,int nums[],List <List<Integer>>result,List <Integer> currentSubset)
    {
        
        if( index==nums.length)
        {

             result.add(new ArrayList<>(currentSubset));
             return ;
        }
       // skip
        helper(index+1,nums,result,currentSubset);
        //pick
        currentSubset.add(nums[index]);
        helper(index+1,nums,result,currentSubset);
        //backtracking
        currentSubset.remove(currentSubset.size()-1);
    }
}