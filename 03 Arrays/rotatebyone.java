public class rotatebyone {

    public void leftrotate(int[] arr) {

        int temp = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {

        int[] nums = {13, 46, 24, 52, 20, 9};

        rotatebyone obj = new rotatebyone();

        obj.leftrotate(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}