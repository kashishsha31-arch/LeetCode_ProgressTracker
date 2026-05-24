class Solution {
    int c=0;
    public int numberOfSteps(int num) 
    { 
       return  helper(num);  
    }
    public int helper(int num)
    {
         if(num==0)
        {
            return c;
        }
        if(num%2==0)//num is even
        {
            num=num/2;
            c++;
        }
        else
        {
          num=num-1;
          c++;//subtracting -1;
        }
        return helper(num);
    }
}