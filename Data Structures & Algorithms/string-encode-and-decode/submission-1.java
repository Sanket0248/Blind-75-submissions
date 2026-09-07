class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {

            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);
        }

        return encoded.toString();
    }


    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the separator #
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract length
            int length = Integer.parseInt(str.substring(i, j));

            // String starts after #
            int start = j + 1;

            // Extract exactly 'length' characters
            String word = str.substring(start, start + length);

            result.add(word);

            // Move to the next encoded string
            i = start + length;
        }

        return result;
    }
}