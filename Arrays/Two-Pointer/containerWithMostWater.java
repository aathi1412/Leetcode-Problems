
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1, max = 0;

        while(left < right){
            int len = right - left;
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, min*len);

            while(left < right &&  height[left] <= min) left++;
            while(left < right &&  height[right] <= min) right--;
            
        }
        return max;
    }
