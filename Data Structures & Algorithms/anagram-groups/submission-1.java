class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> result = new ArrayList<>();
//         // result.add(new ArrayList<>());

//         Map<String,Integer> map = new HashMap<>();


//         for(String s : strs){
//             // int[] sArray = s.charToArray();
//             Arrays.sort(sArray);
//             StirngBuilder sb = new StringBuilder();
//             for(char c : sArray) sb.append(c);

//             if(map.containsKey(sb.toString())){
//                 result.get(map.get(sb.toString())).add(s);
//             }
//             else{
//                 //map.put(key, result.size());
//                 result.add(new ArrayList<>());
//                 result.get(result.size()-1).add(s);
//             }
//         }

//         return result;
//     }
// }