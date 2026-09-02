class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0; 
        int right = n - 1;
        int position = n - 1;

        while(left <= right) {
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                result[position] = nums[right] * nums[right];
                right--;
            } else { 
                result[position] = nums[left] * nums[left];
                left++;
            }
            position--;
        }
        return result;
    }
}