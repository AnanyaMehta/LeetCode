class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;List<Integer>list = new ArrayList<>();
        Arrays.sort(nums);int c=1;
        for(int i=0; i<n-1;i++){
            if(nums[i]== nums[i+1]) c++;
            else{
                if(c>n/3){
                    list.add(nums[i]); c=1;
                }
                c=1;
            }
        }
        if(c>n/3){
            list.add(nums[n-1]);c=1;
        }
        return list;
        
    }
}