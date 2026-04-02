class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int realSum = sum/3;
        sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum==realSum){    
                count++;
                sum=0;
            }
        }
        return count>=3;
    }
}