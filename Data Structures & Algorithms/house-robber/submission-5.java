class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        if(nums.length == 1) return nums[0];

        int rob1 = 0;
        int rob2 = 0;

        for(int num : nums){
            int temp = Math.max(rob2,rob1 + num);

            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;

    }
}
