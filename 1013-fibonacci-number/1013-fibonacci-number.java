// class Solution{
//     public int fib(int n){
//         if(n<=1){
//             return n;
//         }
//         return fib(n-1)+fib(n-2);
//     }
// }

//done with memoization

class Solution {
    public int fib(int n) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        if(hs.containsKey(n)){
            return hs.get(n);
        }
        if(n<=1){
            return n;
        }

        int result = fib(n-1) + fib(n-2);
        hs.put(n,result);

        return result;
    }
}