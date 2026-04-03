class Solution {
    public static int BinarySearch(int nums[],int low,int high,int key){
        while(low<=high){
        int mid=(low+high)/2;
         if(nums[mid]==key){
            return mid;
         }
         else if(nums[mid]>key){
            high=mid-1;
         }
         else{
            low=mid+1;
         }
        
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        return BinarySearch(nums,low,high,target);
      

    }
}