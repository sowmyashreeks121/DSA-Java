class Solution {
    public int secondLargestElement(int[] nums) {

        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            }
            else if (nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
            }
        }

        if (slargest == Integer.MIN_VALUE) {
            return -1;
        }

        return slargest;
    }
    public static void main(String[] args) {
        int[] nums = {13, 46, 24, 52, 20, 9};

        Solution obj = new Solution();

        System.out.println(obj.secondLargestElement(nums));
    }
}