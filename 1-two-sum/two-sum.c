int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* ans=(int*)malloc(2 * sizeof(int));
    if(ans==NULL)
    { 
        *returnSize=0;
        return NULL;
    }
    else{
    for(int i=0;i<numsSize;i++)
    {
        for(int j=i+1;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                ans[0]=i;
                ans[1]=j;
                *returnSize=2;
                return ans;
            }
        }
    }
}
    free(ans);
    *returnSize=0;
    return NULL;
}