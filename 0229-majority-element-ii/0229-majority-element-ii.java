class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int count1=0,count2=0;
        int ele1=-1,ele2=-1;
        for(int num:nums){
            if(count1==0 && ele2!=num){
                count1++;
                ele1=num;
            }
            else if(count2==0 && ele1!=num){
                count2++;
                ele2=num;
            }
            else if(ele1==num){
                count1++;
            }
            else if(ele2==num){
                count2++;
            }
            else{
                count1--;count2--;
            }
        }
        int c1=0,c2=0;
        for(int num:nums){
            if(num==ele1){c1++;}
            else if(num==ele2){c2++;}
            else{
                continue;
            }
        }
        if(c1>(nums.length/3)){
            ans.add(ele1);
        }
        if(c2>nums.length/3){
            ans.add(ele2);
        }
        return ans;
    }

}