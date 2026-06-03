
public int totalFruit(int[] fruits) {
    int[] freq = new int[fruits.length];

    int left = 0, right = 0, max = 0, limit = 0;

    while(right < fruits.length){
        if(freq[fruits[right]] == 0) limit++;
        freq[fruits[right]]++;

        while(limit > 2){
            freq[fruits[left]]--;

            if(freq[fruits[left]] == 0) limit--;
            left++;
        }

        max = Math.max(max, right - left + 1);
        right++;
    }
    
    return max;
}
