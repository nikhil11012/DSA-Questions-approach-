// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i =0;i<matrix.length;i++){
//             for(int j =0 ;j<matrix.length;j++){
//                 if(matrix[i][j]== target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        
        int row = 0;
        int col = m -1 ;

        while(col>=0 && row<n){
            int current = matrix[row][col];
            if(current == target){
                return true;
            }else if(current> target){
                col --;
            }else{
                row++;
            }
        }
        return false;
    }
}