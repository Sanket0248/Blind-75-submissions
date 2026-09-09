class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){
           int minHeight = Math.min(heights[left], heights[right]);

           int tempMaxWater = (minHeight) * (right - left);

           maxWater = Math.max(maxWater,tempMaxWater);
           
           if(heights[left] < heights[right]) left++;
           else right --;
        }
        return maxWater;
    }
}
