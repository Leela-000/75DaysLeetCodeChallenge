class Solution {
    private boolean isDiv(int n,int m){
        long sum=1;
        while(n>0){
            sum*=(n%10);
            n/=10;
        }
        return (sum%m==0);
    }
    public int smallestNumber(int n, int t) {
        for(int i=0;i<=t;i++){
            if(isDiv(n+(i),t)){
                return n+(i);
            }
        }
        return -1;
    }
}
