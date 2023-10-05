class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int right =nums.length-1;
        int left = 0;


        while(left<=right){
            if((nums[left]%2)!=0 && nums[right]%2==0){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right] = temp;
                left++;
                right--;

            }else if(nums[right]%2!=0){
                right--;
            }
            else if(nums[left]%2==0){
                left++;
            }
        }

        return nums;
    }
}
