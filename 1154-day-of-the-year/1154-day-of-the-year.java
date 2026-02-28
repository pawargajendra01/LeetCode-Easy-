class Solution {
    public boolean isLeap(int year){
            if((year%4==0 && year % 100 != 0)|| (year%400 == 0) ){
                return true;
            }
            else{
                return false;
            }
    }
    public int dayOfYear(String date) {

        int day =Integer.parseInt(date.substring(8, 10));
        int month =Integer.parseInt(date.substring(5, 7));
        int year =Integer.parseInt(date.substring(0, 4)); 

        int sum=0;
        for(int i=1;i<month;i++){
            if(i==2 && isLeap(year)){
             sum += 29;   
            }
            else if(i==2 && !isLeap(year)){
             sum += 28;   
            }
            else if(i == 1 || i == 3 || i == 5 || i == 7 || 
                    i == 8 || i == 10 || i == 12){
                sum += 31;
            }
            else{
                sum += 30;
            }
        }

        sum+=day;

    return sum;
    }
    
}