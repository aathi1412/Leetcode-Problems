
public long maximumSubarraySum(int[] nums, int k) {

    int max = 0;
    for(int i = 0; i < nums.length; i++){
        max = Math.max(max, nums[i]);
    }
    int[] freq = new int[max + 1];
// --------------------------------------------------------------------

    int left = 0, limit = 0;
    long sum = 0, maxSum = 0;

    for(int right = 0; right < nums.length; right++){

        sum += nums[right];
        if(freq[nums[right]] == 0) limit++;
        freq[nums[right]]++;
        
        if(right - left + 1 > k ){
            sum -= nums[left];
            freq[nums[left]]--;
            if(freq[nums[left]] == 0) limit--;
            left++;
        }

        if((right - left + 1) == k && limit == k){
            maxSum = Math.max(maxSum, sum);
        }
    }
    return maxSum;
}
