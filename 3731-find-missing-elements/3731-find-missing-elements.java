class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int max=Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
        int min=Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=min;i<=max;i++){
            if(!map.containsKey(i)){
                res.add(i);
            }
        }
        return res;

    }
}