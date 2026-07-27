class Solution {
    public int[][] setZeroes(int[][] a) {
        // Your code goes here
        int col0=1;
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    if(j!=0){
                        a[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(a[i][0]==0||a[0][j]==0){
                    a[i][j]=0;
                }
            }
        }
        if(a[0][0]==0){
            for(int j=0;j<m;j++){
                a[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                a[i][0]=0;
            }
        }
        return a;
    }
}