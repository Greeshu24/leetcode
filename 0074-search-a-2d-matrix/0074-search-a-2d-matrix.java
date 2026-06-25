class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = -1;
        int s = 0;
        int e = m-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(matrix[mid][n-1]<target)
            {
                s = mid+1;
            }
            else{
                row = mid;
                e = mid-1;
            }
            
        }
        if(row==-1)
        {
            return false;
        }
        s = 0;
        e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;

            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
        
    }
}