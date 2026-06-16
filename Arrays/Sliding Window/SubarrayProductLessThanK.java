
public int numSubarrayProductLessThanK(int[] nums, int k) {
    if(k <= 1) return 0;
    int prefixSum = 1;
    int left = 0, right = 0, count = 0;

    while(right < nums.length){
        prefixSum *= nums[right];

        while(prefixSum >= k){
            prefixSum /= nums[left];
            left++;
        }
        count += right -left + 1;
        right++;
    }
    return count;
}
