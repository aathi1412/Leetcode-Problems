
public int splitArray(int[] nums, int k) {
    int start = 0;
    int end = 0;
    for(int num: nums){
        start = Math.max(start, num);
        end += num;
    }

    while(start < end){
        int mid = start + (end - start) / 2;
        int sum = 0, parts = 1;

        for(int num: nums){
            if(sum + num > mid){
                sum = num;
                parts++;
            }
            else sum += num;
        }
        if(parts > k) start = mid + 1;
        else end = mid;
    }
    return start;
}
