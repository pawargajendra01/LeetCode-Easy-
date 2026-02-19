class Solution {
    public String[] findRelativeRanks(int[] score) {
        String arr[] = new String[score.length];
        String ans[] = new String[score.length];
        int nums[] =score.clone();
    
        Arrays.sort(nums);
        arr[score.length-1] = "Gold Medal";

        if(score.length>1){
        arr[score.length-2] = "Silver Medal";
        }

        if(score.length>2){
        arr[score.length-3] = "Bronze Medal";
        }
        
        if(score.length > 3){
        for (int i = score.length - 4; i >=0; i--) {
            arr[i] = Integer.toString(score.length-i);
        }
        }
        for (int j = 0; j < score.length; j++) {
            for (int k = 0; k < score.length; k++) {
                if (score[j] == nums[k]) {
                    ans[j] = arr[k];
                    break;
                }
            }
        }
        return ans;
    }
}