
public int subarraysDivByK(int[] nums, int k) {
    int freq[] = new int[k];
    freq[0] = 1;
    int prefixSum = 0, count = 0;
    for(int n: nums){
        prefixSum += n;
        int rem = prefixSum % k;
        if(rem < 0) rem += k;
        count += freq[rem];
        freq[rem]++;
    }
    return count;
}
