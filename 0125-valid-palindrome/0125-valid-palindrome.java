class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
             left++;
        }
        while(right>left && !Character.isLetterOrDigit(s.charAt(right))){
             right--;
        }
        char l_c=s.charAt(left);
        char r_c=s.charAt(right);
        if(Character.isUpperCase(s.charAt(left))){
            l_c=Character.toLowerCase(s.charAt(left));
        }
        if(Character.isUpperCase(s.charAt(right))){
           r_c=Character.toLowerCase(s.charAt(right));
        }
        if(l_c!=r_c){
            return false;
        }
        left+=1;
        right-=1;
    }
    return true;
    }
}