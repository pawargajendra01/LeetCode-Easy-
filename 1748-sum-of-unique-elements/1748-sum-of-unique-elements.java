class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }
         for(int num : nums){
            if(freq[num] == 1){
                sum = sum + num;
            }
        }
        return sum;
        
    }
}