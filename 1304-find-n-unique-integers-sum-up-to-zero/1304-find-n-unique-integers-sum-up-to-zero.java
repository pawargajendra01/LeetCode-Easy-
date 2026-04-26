class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int count = -(n/2);
        for(int i=0;i<n;i++){
            if(n%2==0 && count==0){
                arr[i]=++count;
            }
            else{
                arr[i]=count;
            }
            count++;
        }
        return arr;
    }
}