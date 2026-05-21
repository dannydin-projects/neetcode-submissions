class Solution {
    public boolean isAnagram(String s, String t) {
        char []sArr= s.toCharArray();
        Arrays.sort(sArr);
        s = String.valueOf(sArr);

        char []tArr= t.toCharArray();
        Arrays.sort(tArr);
        t = String.valueOf(tArr);
        
        if(s.equals(t))
            return true;
        return false;    
    }
    
}
