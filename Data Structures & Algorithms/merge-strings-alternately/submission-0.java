class Solution {
    public String mergeAlternately(String word1, String word2) {
        int wlen1= word1.length();
        int wlen2= word2.length();
        int n = Math.min(wlen1,wlen2);
        StringBuilder st = new StringBuilder();
        int i=0;
        for(i=0;i<n;i++){
            st.append(word1.charAt(i));
            st.append(word2.charAt(i));
            
        }
        if (wlen1 > wlen2) {
            st.append(word1.substring(n));
        } else {
            st.append(word2.substring(n));
        }
        return st.toString();

        
    }
}