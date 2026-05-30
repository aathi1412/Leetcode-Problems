
public int minDays(int[] bloomDay, int m, int k) {
    if((long) m * k > bloomDay.length) return -1;

    int left = 1, right = 0, ans = -1;

    for(int w: bloomDay){
        right = Math.max(right, w);
    }
    
    while(left <= right){
        int mid = left + (right - left) / 2;

        if(bloom(bloomDay, m, k, mid) == true){
            ans = mid;
            right = mid - 1;
        }
        else left = mid + 1;
    }
    return ans;
}

private boolean bloom(int[] bloomDay, int m, int k, int cap){
    int count = 0, bout = 0;
    for(int b: bloomDay){
        if(b <= cap){
            count++;
            if(count == k){
                bout++;
                count = 0;
            }
        }
        else count = 0;
    }
    return bout >= m;
}   

