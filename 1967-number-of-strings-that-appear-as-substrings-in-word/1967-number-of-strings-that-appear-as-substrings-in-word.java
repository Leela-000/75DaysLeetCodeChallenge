class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int co=0;
        for(String a:patterns){
            if(word.indexOf(a)!=-1){
                co++;
            }
        }
        return co;
    }
}