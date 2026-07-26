class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        if(n<3){
            return 0;
        }
        if(n==3){
            return nums[0]*nums[1]*nums[2];
        }
        int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE,m3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int c=nums[i];
            if(c>m1){
                m3=m2;
                m2=m1;
                m1=c;
            }
            else if(c>m2){
                m3=m2;
                m2=c;
            }
            else if(c>m3){
                m3=c;
            }
            if (c < min1) {
                min2 = min1;
                min1 = c;
            } else if (c < min2) {
                min2 = c;
            }
        }
        return Math.max(m1*m2*m3,m1*min1*min2);
    }
}