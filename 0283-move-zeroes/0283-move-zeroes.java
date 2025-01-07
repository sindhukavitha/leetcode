class Solution {
    public void moveZeroes(int[] nums) {
        int low=0,mid=0;
        while(mid<nums.length)
        {
            if(nums[mid]!=0)
            {
                swap(nums,mid,low);
                low++;
            }
            mid++;
        }
    }
    public void swap(int[] a,int b,int c)
    {
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }
}