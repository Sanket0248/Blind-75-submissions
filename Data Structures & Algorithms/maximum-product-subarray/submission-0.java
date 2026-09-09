class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];

        for(int i = 1; i < nums.length; i++){
            int x = nums[i];
            int currentMin = Math.min(x, Math.min(x*minProduct, x*maxProduct));
            int currentMax = Math.max(x, Math.max(x*minProduct, x*maxProduct)); 

            maxProduct = currentMax;
            minProduct = currentMin;

            answer = Math.max(answer,maxProduct);
        }
        return answer;
    }
}
