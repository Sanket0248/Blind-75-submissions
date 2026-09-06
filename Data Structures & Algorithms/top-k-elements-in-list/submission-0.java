class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int[][] array = new int[map.size()][2];
        int index = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            array[index][0] = entry.getKey();
            array[index][1] = entry.getValue();
            index++;
        }

        Arrays.sort(array, (a,b) -> b[1]-a[1]);

        int[] ans = new int[k];

        for(int i=0; i<k; i++){
            ans[i] = array[i][0];
        }

        return ans;
    }
}
