
public int[] searchRange(int[] nums, int target) {
    int first = firstPos(nums, target);
    int last = lastPos(nums, target);

    return new int[]{first, last};
}

private int firstPos(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int ans = -1;

    while(left <= right){
        int mid = left + (right - left) / 2;
        if(nums[mid] == target){
            ans = mid;
            right = mid - 1;
        }
        else if(nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return ans;
}

private int lastPos(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int ans = -1;

    while(left <= right){
        int mid = left + (right - left) / 2;
        if(nums[mid] == target){
            ans = mid;
            left = mid + 1;
        }
        else if(nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return ans;
}
