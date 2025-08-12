class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end =0;
        int maxLen = 0;
        HashMap<Character,Integer> hs = new HashMap<>();

        for(end=0;end<s.length();end++){
            char c = s.charAt(end);

            if(hs.containsKey(c)){
                start = Math.max(start,hs.get(c)+1);
            }
            hs.put(c,end);
            
            maxLen = Math.max(maxLen,end-start+1);
        }
        return maxLen;
    }
}