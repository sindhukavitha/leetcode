int firstMissingPositive(int* nums, int numsSize) {
    for(int i=0;i<numsSize;i++)
    {
        while(nums[i]<=numsSize && nums[i]>0 && nums[nums[i]-1]!=nums[i])
        {
            int temp=nums[nums[i]-1];
            nums[nums[i]-1]=nums[i];
            nums[i]=temp;

        }
    }
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]!=i+1)
        return i+1;
    }
    return numsSize+1;
}