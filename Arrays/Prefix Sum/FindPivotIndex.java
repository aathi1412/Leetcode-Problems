
public int pivotIndex(int[] nums) {
    int n = nums.length;
    
    int totalSum = 0;
    for(int N: nums) totalSum += N;

    int leftSum = 0;
    
    for(int i = 0; i< n; i++){
        int rightSum = totalSum - leftSum - nums[i];

        if(leftSum == rightSum) return i;
        leftSum += nums[i];
    }
    return -1;
}
