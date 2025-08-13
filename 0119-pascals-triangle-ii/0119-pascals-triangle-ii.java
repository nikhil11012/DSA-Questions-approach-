// class Solution {
//     public int result(int row , int col){

//         if(row == 0 || col == 0 || row == col){
//             return 1;
//         }

//         return result(row-1,col-1) + result(row-1,col);
//     }
//     public List<Integer> getRow(int rowIndex) {
//         List<Integer> res = new ArrayList<>();

//         int row = rowIndex;

//         for(int col = 0; col<= row; col++){
//             int ans = result(row,col);
//             res.add(ans);
//         }
//         return res;
//     }
// }



class Solution {
    HashMap<String,Integer> hs = new HashMap<>();

    public int result(int row , int col){
        if(row == 0 || col == 0 || row == col){
            return 1;
        }
        String key = Integer.toString(row)+" "+ Integer.toString(col);

        if(hs.containsKey(key)){
            return hs.get(key);
        }
        int result = result(row-1,col-1) + result(row-1,col);

        hs.put(key,result);
        return hs.get(key);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        int row = rowIndex;

        for(int col = 0; col<= row; col++){
            int ans = result(row,col);
            res.add(ans);
        }
        return res;
    }
}