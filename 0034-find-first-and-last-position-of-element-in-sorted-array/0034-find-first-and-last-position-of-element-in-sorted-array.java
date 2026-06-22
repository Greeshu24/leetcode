class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[] {first,last};
    }
        public int findFirst(int[] nums,int target){
        int l=0;
        int h=nums.length-1;
        int index=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>target){
                h=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                index=mid;
                h=mid-1;
            }
        }
        return index;
        }
        public int findLast(int[] nums,int target){
        int l=0;
        int h=nums.length-1;
        int l_index=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>target){
                h=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                l_index=mid;
                l=mid+1;
            }
        }
        return l_index;
    }
}