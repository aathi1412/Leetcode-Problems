
public int findMaxConsecutiveOnes(int[] nums) {
    int i = 0, len = 0, max = 0;

    while(i <= nums.length-1){
        if(nums[i] == 1){
            len++;
        }
        else{
            max = Math.max(max, len);
            len = 0;
        }
        i++;
    }

    return max = Math.max(max, len);
}
