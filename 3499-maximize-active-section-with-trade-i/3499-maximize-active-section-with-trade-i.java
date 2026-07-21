class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int len=s.length();
        int  max=0,ones=0,prevrun=-1;
        int i=0;
        while(i<len){
            if(s.charAt(i)=='1'){
                ones++;
                i++;
            }
            else{
                int curr_run=0;
                while(i<len && s.charAt(i)=='0'){
                    curr_run++;
                    i++;
                }
                if(prevrun>0){
                   max=Math.max(max,prevrun+curr_run);
                }
                prevrun=curr_run;
            }
        }
        return max+ones;
        
    }
}