class Solution {
    public static void Reverse(char[] s,int start,int end){
        if(start>=end){
            return;
        }
        Character temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        Reverse(s,start+1,end-1);
    }
    public void reverseString(char[] s) {
        int start =0;
        int end = s.length-1;
        Reverse(s,start,end);
    }
}