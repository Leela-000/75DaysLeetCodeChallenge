class Solution {
   public static void swap(int[] nums1, int i, int[] nums2, int j){
        int t=nums1[i];
        nums1[i]=nums2[j];
        nums2[j]=t;
   }
    public static void merge(int[] nums1, int n, int[] nums2, int m) {
      int len=(n+m);
      int gap=(len/2)+(len%2); 
      while(gap>0){
        int left=0,right=left+gap;
        while(right<len){
        //arr1 with arr2
        if(left<n && right>=n){
            if(nums1[left]>nums2[right-n]){
                swap(nums1,left,nums2,right-n);
            }
        }
        //arr2 with arr2
        else if(left>=n){
            if(nums2[left-n]>nums2[right-n]){
                swap(nums2,left-n,nums2,right-n);
            }
        }
        else {
            if(nums1[left]>nums1[right]){
                swap(nums1,left,nums1,right);
            }

        }
        left++; right++;
        }
            if(gap==1)break;
            gap=(gap/2)+(gap%2);
      }
       for(int i = 0; i < m; i++){
            nums1[n + i] = nums2[i];
        }
    }
}