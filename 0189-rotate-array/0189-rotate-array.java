class Solution {
    public static void rev(int[] arr,int left,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            
            left++;
            right--;
        }

    }
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        }
 
        int n = nums.length;
        k = n- (k%n);
        if(k<=0)return;
        rev(nums,0,k-1);
        rev(nums,k,n-1);
        rev(nums,0,n-1);
    }
}