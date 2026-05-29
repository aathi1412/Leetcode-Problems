
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0, ans = right;

        for(int m: piles) right = Math.max(right, m);

        while(left <= right){
            int mid = left + (right - left) / 2;
            long hours = 0;
            for(int n: piles){
                hours += (n + mid - 1) / mid;
            }
            if(hours <= h){
                ans = mid;
                right = mid -1;
            }
            else left = mid + 1;
        }
        return ans;
    }
