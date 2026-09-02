class Solution {
    public boolean isPalindrome(int x) 
    {
        int d, rev=0;
        if(x<0)
        return false;
        for(int i=x; i>0; i=i/10)
        {
            d = i%10;
            rev = rev*10+d;
        }
        if(rev==x)
        return true;
        else
        return false;
    }
}

        
