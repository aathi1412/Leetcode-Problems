
public int shipWithinDays(int[] weights, int days) {
    int left = 0, right = 0, ans = 0;
    for(int w: weights){
        left = Math.max(left, w);
        right += w; 
    }
    
    while(left <= right){
        int mid = left + (right - left) / 2;

        if(capacity(weights, days, mid) == true){
            ans = mid;
            right = mid - 1;
        }
        else left = mid + 1;
    }
    return ans;
}

private boolean capacity(int[] weights, int days, int cap){
    int currDay = 1, sum = 0;
    for(int w: weights){
        if(sum + w <= cap){
            sum += w;
        }
        else{
            sum = w; 
            currDay++;
        }
    }
    return currDay <= days;
}   
