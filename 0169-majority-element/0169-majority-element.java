class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=-1;
        for(int num:nums){
            if(count==0){
                ele=num;
                count++;
            }
            else if(ele==num){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}