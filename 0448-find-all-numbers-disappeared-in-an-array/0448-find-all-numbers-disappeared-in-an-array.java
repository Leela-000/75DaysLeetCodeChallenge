class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean seen[]=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            seen[nums[i]]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!seen[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}