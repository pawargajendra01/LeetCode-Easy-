class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
             if(nums[i]==nums[i-1]){
                count++;
             }
             else{
                pairs+= (count * (count - 1)) / 2;
                count=1;
             }
        }
        if(nums[nums.length-2]==nums[nums.length-1]){
            pairs+= (count * (count - 1)) / 2;
        }
        return pairs;
    }
}