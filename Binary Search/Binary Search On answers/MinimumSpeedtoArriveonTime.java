
public int minSpeedOnTime(int[] dist, double hour) {
    int left = 1, right = 10000000, ans = -1;
    // for(int n: dist) right = Math.max(right, n);

    while(left <= right){
        int mid = left + (right - left) / 2;

        double speed = 0.0;
        for(int i=0; i < dist.length-1; i++) speed += Math.ceil((double) dist[i] / mid);
        speed += (double) dist[dist.length-1] / mid;

        if(speed <= hour){
            ans = mid;
            right = mid - 1;
        }
        else{
            left = mid + 1;
        }
    }
    return ans;
}
