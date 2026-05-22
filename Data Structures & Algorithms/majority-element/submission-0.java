class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int k = n/2;
        Map<Integer,Integer> hm = new HashMap();
        for(int i=0;i<n;i++){
            int temp =nums[i];
            if(hm.containsKey(temp)){
                hm.put(temp, hm.get(temp)+1);
            }
            else
                hm.put(temp,1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()>k){
                return entry.getKey();
            }
        }
        return 0;


    }
}