class Solution {
    public int maximumSwap(int num) {
        char arr[]=Integer.toString(num).toCharArray();
        int last[]=new int[10];
        for(int i=0;i<arr.length;i++){
            last[arr[i]-'0']=i;
        }
        for(int i=0;i<arr.length;i++){
            int curr=arr[i]-'0';
            for(int j=9;j>curr;j--){
                if(last[j]>i){
                    char temp=arr[last[j]];
                    arr[last[j]]=arr[i];
                    arr[i]=temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }
        return num;
    }
}