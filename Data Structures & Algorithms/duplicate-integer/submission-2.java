class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet();
        for(Integer x: nums){
            if(s.contains(x)){
                return true;
            }
            s.add(x);
        }
        return false;
    }
}