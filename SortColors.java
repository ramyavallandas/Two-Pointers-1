// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// 2-pointer
class Solution {
  public void sortColors(int[] nums) {
    int n= nums.length;

    int low=0;
    int high =n-1;
    int mid = 0;
    while(mid<=high){
      if(nums[mid]==2){
        swap(nums,mid,high);
        high--;
      }
      else if(nums[mid]==0){
        swap(nums,mid,low);
        low++; mid++;
      }
      else{
        mid++;
      }
    }

  }
  private void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}

