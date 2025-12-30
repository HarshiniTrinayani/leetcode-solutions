class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        int pos=n-1;
        int [] result=new int[n];
       while(i<=j){
       int left=nums[i]*nums[i];
       int right=nums[j]*nums[j];
       if(left>right){
        result[pos]=left;
        i++;
       }else{
        result[pos]=right;
        j--;
       }
       pos--;
       }
     return result;
    }
}
