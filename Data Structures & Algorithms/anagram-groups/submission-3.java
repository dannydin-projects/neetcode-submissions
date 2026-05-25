class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap();
        for(String s: strs){
            int[] arr = new int[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a']++;
            }
            String hash = Arrays.toString(arr);
            hm.putIfAbsent(hash, new ArrayList<>());
            hm.get(hash).add(s);
        }
        return new ArrayList(hm.values());
    }
}
