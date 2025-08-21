

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