
public int search(int[] nums, int target) {
    int left = 0, right = nums.length-1;
    return searchb(nums, target, left, right);
}

public int searchb(int[] nums, int target, int left, int right){
    if(left <= right){
        int mid = left + (right - left) / 2;

        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return searchb(nums, target, mid + 1, right);
        else return searchb(nums, target, left, mid - 1);
    }
    return -1;
}
