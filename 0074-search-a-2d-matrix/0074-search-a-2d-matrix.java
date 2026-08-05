class Solution {
    public boolean searchMatrix(int[][] a, int k) {
        int low=0, high=a.length*a[0].length-1;
        int n=a.length;
        int m=a[0].length;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;

            if(a[row][col]==k){
                return true;
            }
            else if(a[row][col]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return false;

    }
}