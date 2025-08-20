class Solution {
    public static void merge(int[]nums,int start,int mid, int end){
        int[]temp = new int[end-start + 1];

        int p1 = start;
        int p2 = mid+1;
        int p3 = 0;

        while(p1<=mid && p2<=end){
            if(nums[p1]<nums[p2]){
                temp[p3] = nums[p1];
                p1++;
            }else{
                temp[p3] = nums[p2];
                p2++;
            }
            p3++;
        }
        while(p1<=mid){
            temp[p3]= nums[p1];
            p1++;
            p3++;
        }
        while(p2<=end){
            temp[p3]=nums[p2];
            p2++;
            p3++;
        }
        for (int k = 0; k < temp.length; k++) {
            nums[start + k] = temp[k];
        }
    }
    public static void mergeSort(int[]nums,int i, int j){
        if(i>=j){
            return;
        }
        int mid = (i+j)/2;
        mergeSort(nums,i,mid);
        mergeSort(nums,mid+1,j);

        merge(nums,i,mid,j);
    }
    public int[] sortArray(int[] nums) {
        int i =0 ;
        int j = nums.length-1;
        mergeSort(nums,i,j);
        return nums;
    }
}