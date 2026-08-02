class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        boolean[] map=new boolean[101];
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            map[num]=true;
            if(num>max){max=num;}
            if(num<min){min=num;}
        }
        for(int i=min;i<max;i++){
            if(!map[i]){
                res.add(i);
            }
        }
        return res;

    }
}