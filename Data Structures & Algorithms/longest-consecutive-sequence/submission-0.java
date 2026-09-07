class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int best = 0;
        for(int x : set){
            if(set.contains(x-1)) continue;

            int curr = x;
            int count = 1;

            while(set.contains(curr+1)){
                curr++;
                count++;
            }
            best = Math.max(best, count);
        }
        return best;
    }
}
