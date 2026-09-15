class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        
        int start = 0;
        int end = 0;


        for(int i = 0; i < n; i++){

            int odd = expand(i,i,s);
            int even = expand(i,i+1,s);

            int len = Math.max(odd,even);

            if(len > end - start){
                start = i - (len-1) / 2;
                end = i + len / 2;
            }

            
        }
        return s.substring(start,end+1);
    }

    public int expand(int l, int r, String s){
        int n = s.length();
        while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
            r++;
            l--;
        }
        return r-l-1;
    }
}
