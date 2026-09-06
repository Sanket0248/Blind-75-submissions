class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();

        for(String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            StringBuilder sb = new StringBuilder();
            for(char c : sArray) sb.append(c);
            String key = sb.toString();

            if(map.containsKey(key)){
                result.get(map.get(key)).add(s);
            }
            else{
                map.put(key, result.size());
                result.add(new ArrayList<>());
                result.get(result.size()-1).add(s);
            }
        }

        return result;
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