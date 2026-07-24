class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<2){return n;}
        if(n==2){
            if(nums[0]==nums[1])return 1;
            return 2;
        }
        /* here max number in nums is 1500 the bit representation 10111011100   number of bits 11 so the max xor result is 0<=res<2power11 ie 0<=es<2028 ie 0<=res<=2047*/
        boolean[] present= new boolean[2048]; // [0.....2047]
        for(int num:nums){
            present[num]=true;
        }
        boolean priorXOR[]=new boolean[2048];
        for(int i=0;i<2048;i++){
            if(!present[i])continue;
            for(int j=0;j<2048;j++){
                if(!present[j])continue;
                priorXOR[i^j]=true;

            }
        }
        boolean ans[]=new boolean[2048];
        for(int k=0;k<2048;k++){
            if(!priorXOR[k])continue;
            // if(!present[k])continue;
            for(int y=0;y<2048;y++){
                if(!present[y])continue;
                ans[k^y]=true;
            }
        }
        int count=0;
        for(boolean b:ans){
            if(b)count++;
        }
        return count;

    }
}