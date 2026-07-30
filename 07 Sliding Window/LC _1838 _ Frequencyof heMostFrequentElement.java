
import java.util.Arrays;

class Solution {

    public int maxFrequency(int[] nums, int k) {

        // Step 1: Sort the array.
        // We always make all numbers equal to the largest number in the window.
        Arrays.sort(nums);

        // Left pointer of the sliding window.
        int left = 0;

        // Stores the maximum frequency found.
        int ans = 1;

        // Sum of all elements inside the current window.
        // long is used because the sum can exceed int range.
        long sum = 0;

        // Expand the window one element at a time.
        for (int right = 0; right < nums.length; right++) {

            // Include nums[right] in the current window.
            sum += nums[right];

            // If the current window needs more than k operations,
            // keep removing elements from the left.
            while ((long) nums[right] * (right - left + 1) - sum > k) {

                // Remove the leftmost element from the window sum.
                sum -= nums[left];

                // Move the left pointer forward.
                left++;
            }

            // Current window is valid.
            // Update the maximum frequency.
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}