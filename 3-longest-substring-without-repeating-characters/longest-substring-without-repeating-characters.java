class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Have I seen this character before? And if yes, WHERE was it?"
        HashMap <Character,Integer> map=new HashMap<>();//to store char index
         int left=0;
         int maxL=0;
        //  char []=s.toCharArray.size
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);//getting each character
            if(map.containsKey(ch))
            {
                left=Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            maxL=Math.max(maxL,right-left+1);

        }
        return maxL;
            }
}