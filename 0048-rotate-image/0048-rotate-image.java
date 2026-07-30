class Solution {
    public int[][] rotate(int[][] a) {
        int n=a.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
        for(int[] row:a){
            reverseRow(row);
        }
        return a;
    }
    private void reverseRow(int[] row){
        int left=0, right=row.length-1;
        while(left<right){
            int t=row[left];
            row[left]=row[right];
            row[right]=t;
            left++; right--;
        }
    }
}