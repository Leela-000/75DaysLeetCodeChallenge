class Solution {
    public static void reverse(int[] a,int left,int right){
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public int[] nextPermutation(int[] a) {
        int  ind=-1,n=a.length;
        for(int i=n-2;i>=0;i--){
            if(a[i]<a[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(a,0,n-1);
            return a;
        }
        for(int i=n-1;i>ind;i--){
            if(a[i]>a[ind]){
                int t=a[i];
                a[i]=a[ind];
                a[ind]=t;
                break;
            }
        }
        // i need to reverse the aray from ind+1 to n-1;
        reverse(a,ind+1,n-1);
        return a;
    }
}