class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, l=0, r =n-1 , c=0;
        while(l<r){
            int sum = nums[l] + nums[r];
            if(sum == k){
                c++; l++; r--;
            }else if(sum<k) l++;
            else r--;
        }
        return c;
        
    }
}