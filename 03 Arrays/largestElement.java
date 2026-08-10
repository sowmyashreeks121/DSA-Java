class Solution {

    public int largestElement(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] nums = {13, 46, 24, 52, 20, 9};

        Solution obj = new Solution();

        System.out.println(obj.largestElement(nums));
    }
}