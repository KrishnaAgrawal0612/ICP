class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int a=first(nums,target);
        int b=last(nums,target);
        ans[0]=a;
        ans[1]=b;
        return ans;

    }
    public static int first(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid]==target){
                ans=mid;
               end = mid - 1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
     public static int last(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(nums[mid]==target){
                ans=mid;
                 start= mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
}
