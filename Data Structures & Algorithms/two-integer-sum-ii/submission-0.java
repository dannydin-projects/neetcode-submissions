class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j= numbers.length-1;

        
        while(i<j){
            int n =numbers[i]+numbers[j];
            if(n==target){
                return new int[]{i+1,j+1};
            }
            else if(n>target){
                j--;
            }
            else
                i++;
        }
        return new int[]{};
    }
}
