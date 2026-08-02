class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int max=Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
        int min=Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
        boolean[] map=new boolean[101];
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            map[num]=true;
        }
        for(int i=min;i<max;i++){
            if(!map[i]){
                res.add(i);
            }
        }
        return res;

    }
}