class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] arr = new int[k];

        int[] copy = Arrays.copyOf(nums,nums.length);

        Arrays.sort(copy);
        for(int i=nums.length-1;i>=nums.length-k;i--){
            map.put(copy[i],map.getOrDefault(copy[i],0)+1);
        }
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && (map.get(nums[i])>0)){
                arr[num]=nums[i];
                num++;
                map.put(nums[i],map.get(nums[i])-1);
            }
        }
        return arr;
    }
}