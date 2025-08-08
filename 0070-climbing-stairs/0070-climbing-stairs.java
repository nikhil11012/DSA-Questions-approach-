// class solution{
//     public int climbstairs(int n){
//         int count =0;
//         for(int i = 1;i<=n;i++){
//             for(int j =0;j<n;j++){
//                 if(i+j == n){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// class solution{
//     public int climbstairs(int n){
//         if(n<=1){
//             return 1;
//         }
//         return climbstairs(n-1) + climbstairs(n-2);
//     }
// } exceeds time limit so thats why we use memoization in next soln here

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