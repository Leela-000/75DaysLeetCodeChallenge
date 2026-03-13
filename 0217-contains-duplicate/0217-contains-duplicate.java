import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                a.put(nums[i],a.get(nums[i])+1);
            }
            else{
                a.put(nums[i],1);
            }
        }
        for(int val:a.values()){
            if(val!=1){
                return true;
            }
        }
        return false;
    }
}