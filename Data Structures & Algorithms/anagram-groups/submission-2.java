class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hm = new HashMap();
        for(String s: strs){
            int[] arr = compute(s);
            String key = Arrays.toString(arr);
            
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(s);
        }
        
        return new ArrayList<>(hm.values());
            

        
    }
    public int[] compute(String s){
        int[] ctr = new int[26];
        for(int i=0;i<s.length();i++){
            ctr[s.charAt(i)-'a']++;
        }
        return ctr;
    }
}
