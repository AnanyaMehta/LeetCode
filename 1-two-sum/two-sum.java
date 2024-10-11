class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2]; ans[0]=ans[1]=-1;
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i=0;i<n;i++){
            int num = nums[i], need = target - num;
            if(m.containsKey(need)){
                ans[0] = m.get(need);
                ans[1] = i;
                return ans;
            }

            m.put(num, i);
        }
        return ans;
        
    }
}