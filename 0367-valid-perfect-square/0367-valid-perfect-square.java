class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;

        while (low <= high) {
            long mid = (low+high) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
/*class Solution {
    public boolean isPerfectSquare(int num) {
       for(int i=0;i<num;i++){
        int ans=i*i;
        if(num==ans){
            return true;
        }
       }
       return false;
        
    }
}*/