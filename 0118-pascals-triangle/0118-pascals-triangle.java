class Solution {
    public static List<Integer> generateRow(int row){
        List<Integer> A=new ArrayList<>();
        int ans=1;
        A.add(ans);
        for(int c=1;c<row;c++){
            ans=ans*(row-c)/c;
            A.add(ans);
        }
        return A;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}