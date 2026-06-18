import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        char[] p = s1.toCharArray();
        Arrays.sort(p);
        String sort = new String(p);
        for(int i = 0; i <= s2.length() - k; i++) {
            String sub = s2.substring(i, i + k);
            char[] arr = sub.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(sorted.equals(sort)) {
                return true;
            }
        }
        return false;
    }
}