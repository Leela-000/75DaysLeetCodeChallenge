class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            // }

        }
        int maxNum=-1;
        int maxfreq=0;
        for(Map.Entry<Integer,Integer> entity:map.entrySet()){
            if(maxfreq<entity.getValue()){
                maxfreq=entity.getValue();
                maxNum=entity.getKey();
            }
        }
        if(maxfreq>(nums.length/2)){
            return maxNum;
        }
        return -1;
    }
}