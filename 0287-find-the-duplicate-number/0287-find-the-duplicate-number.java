class Solution {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        if(len<1){
            return -1; 
        }
        if(len==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                return num;
            }
            map.put(num,1);
        }
        return -1;
    }
}