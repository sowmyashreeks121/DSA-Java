class Solution {

    public int removeDuplicates(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3};

        Solution obj = new Solution();

        int k = obj.removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}