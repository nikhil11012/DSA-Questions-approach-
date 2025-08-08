class Solution {
    HashMap<Integer,Integer> hs = new HashMap<>();
    public int climbStairs(int n) {
        if(hs.containsKey(n)){
            return hs.get(n);
        }
        if(n<=1){
            return 1;
        }
        int res = climbStairs(n-1) + climbStairs(n-2);
        hs.put(n,res);
        return res;
    }
}