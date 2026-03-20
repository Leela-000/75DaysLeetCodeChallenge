import java.util.*;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0){return 0;}
        int index=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
                
                }

            }
        
        return index;
        }

    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        Arrays.sort(nums);
        int k=removeDuplicates(nums);
        

       // System.out.println(c);
       for(int i=0;i<k;i++){
        System.out.print(nums[i]+" ");}

    }
}