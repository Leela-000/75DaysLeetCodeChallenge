import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
            int ans[]= new int[2];
            // HashMap is like dictionaries in python working with key and value
            Map<Integer,Integer> sum=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int diff=target-nums[i];
                // It is checking for the required number present in the HashMap or not........
                if(sum.containsKey(diff)){
                    ans[0]=sum.get(diff);
                    ans[1]=i;
                }
                sum.put(nums[i],i);
            }
    
    
    return ans;
    
    
    
    }}