class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i=0,j=0;i<arr.length;i++){
            if(j<nums.length){
                arr[i]=nums[j];
                j++;
            }else{
                j=0;
                arr[i]=nums[j];
                j++;
            }
        }

        return arr;
    }
}