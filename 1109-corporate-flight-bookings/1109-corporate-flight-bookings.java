class Solution {
    public int[] corpFlightBookings(int[][] opr, int n) {
        int[] diff = new int[n];
        int[] arr=new int[n];
        for (int i = 0; i < opr.length; i++) {
            int l = opr[i][0]-1;
            int r = opr[i][1]-1;
            int v = opr[i][2];

            diff[l] += v;
            if (r + 1 < n) {
                diff[r + 1] -= v;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            arr[i] += sum;
        }
        return arr;
    }
}
      