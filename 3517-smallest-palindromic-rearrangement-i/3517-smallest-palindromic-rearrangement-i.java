class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char[] arr=s.toCharArray();
        char[] firstHalf=s.substring(0,mid).toCharArray();
        Arrays.sort(firstHalf);
        // String a=new String(firsthalf);
        // s=a+s.substring(n);
        for(int i=0;i<mid;i++){
            arr[i]=firstHalf[i];
            arr[n-i-1]=arr[i];
        }
        return new String(arr);
    }
}