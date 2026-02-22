class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map =new HashMap<>();
        ArrayList<String> list =new ArrayList<>();

        for(int i=0;i<list2.length;i++){
            map.put(list2[i],i);
        }
        int max = Integer.MAX_VALUE;
        for(int j=0;j<list1.length;j++){
            if(map.containsKey(list1[j])){
                int value = map.get(list1[j]);
                if(value+j<=max){
                    if(value+j<max){
                        list.clear();
                        list.add(list1[j]);
                        max=value+j;
                        continue;
                    }
                    list.add(list1[j]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}