class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxCnt=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch))
                count=count+1;
            }
        maxCnt=count;
        for(int i=k;i<s.length();i++){
            char l=s.charAt(i-k);
            if(isVowel(l))
                count=count-1;
            char r=s.charAt(i);
            if(isVowel(r))
                count=count+1;
            if(maxCnt<count)
            maxCnt=count;
        }
        return maxCnt;
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}