/*class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int k=2;k<=n;k++){
            StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<s.length()){
            int cnt=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                cnt+=1;
                i++;
            }
            ans.append(cnt);
            ans.append(s.charAt(i));
            i++;
        }
        s=ans.toString();
}
return s;
}
}*/
class Solution {
    public String countAndSay(int n) {
        return solve(1,n,"1");
    }
    public String solve(int c,int n,String s){
        if(c==n)
        return s;
        return solve(c+1,n,rle(s));
    }
    public String rle(String s){
                StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<s.length()){
            int cnt=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                cnt++;
                i++;
            }
            ans.append(cnt);
            ans.append(s.charAt(i));
            i++;
        }
        return ans.toString();
    }
}