class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        if(len<=8){
            return len;
        }
        int freq[]=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        long res=0;
        int ind=0;
        for(int i=25;i>=0;i--){
            if(freq[i]!=0){
                res+=freq[i]*((ind/8)+1);
                ind++;
            }
        }
        return (int)res;


    }
}