class Solution {
    public int maxProduct(int n) {
        int max=0;
        int num=Math.abs(n);
        ArrayList<Integer> arr=new ArrayList<>();
        while(num>0){
            arr.add(num%10);
            num/=10;
        }
        Collections.reverse(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                max=Math.max(max,arr.get(i)*arr.get(j));
            }
        }
        return max;
    }
}