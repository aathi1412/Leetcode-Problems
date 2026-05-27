
public int longestOnes(int[] nums, int k) {
    int slow = 0, fast = 0, zeroCount = 0;
    
    while(fast < nums.length){
        if(nums[fast] == 0){
            zeroCount++;
        }
        if(zeroCount > k){
            if(nums[slow] == 0){
                zeroCount--;
            }
            slow++;
        }
        fast++;
    }

    return nums.length - slow;
}
