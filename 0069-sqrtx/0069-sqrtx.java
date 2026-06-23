class Solution {
    public int mySqrt(int x) {
        /*if(x==0)
        return 0;
        int i=1;
        while(i*i<=x){
            i++;
        }
        return i-1;*/
        if(x==0)
        return 0;
        int left=0;
        int right=x;
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if((long)mid*mid>x){
                right=mid-1;
            }
            else if((long)mid*mid<x){
                ans=mid;
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }
}