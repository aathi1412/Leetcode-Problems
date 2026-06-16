
// Here i use Two pointers Approach.
//Explaination: 
          //if i see non zero i swap right and left, then move left and right pointer.
          //if i see zero i move only right pointer.

// Time complexity will be O(n)

public void moveZeroes(int[] nums) {
    int left = 0, right = 0, n = nums.length;
  
    while(right < n){
        if(nums[right] != 0){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
  
            left++;
        }
        right++;
    }
}
