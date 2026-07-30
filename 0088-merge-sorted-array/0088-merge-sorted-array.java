class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=0;
       for(int digit:nums2){
        nums1[m+i]=digit;
        i++;
       } 
       Arrays.sort(nums1);
       for(int res:nums1){
        System.out.print(res+" ");
       }
       System.out.println();
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int nums1[]=new int[m+n];
        int nums2[]=new int[n];
        for(int i=0;i<m;i++){
            nums1[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i]=scn.nextInt();
        }
        merge(nums1,m,nums2,n);
        
    }
}