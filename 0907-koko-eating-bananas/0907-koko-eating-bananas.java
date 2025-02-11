class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        if(n>h)
        {
            return 0;
        }
        int left=1;
        int right=-1;
        for(int i=0;i<n;i++)
        {
          right=Math.max(right,piles[i]);
        }
        int ans=0;
        while(left<=right)
        {
           int timetoken=0;
          int mid=left+(right-left)/2;
          for(int i=0;i<n;i++)
          {
            timetoken+=Math.ceil((double)piles[i]/mid);
          }
          if(timetoken>h)
          {
             left=mid+1;
          }
          else
          {
            ans=mid;
            right=mid-1;
          }
        }
        return ans;
        
        }
    }
