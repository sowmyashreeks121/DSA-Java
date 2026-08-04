class Insertionsort{
    static void Insertionsort(int[] arr, int n)
    {
        for (int i = 0; i<= n-1; i++)
        {
            int j =i;
            while( j >0 && arr [j-1]> arr[j])
            {
                int temp = arr[j-1];
                arr [j-1]= arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }

    public static void main(String args[])
    {
        int[] arr= { 6, 4, 3, 7, 8};
        int n = arr.length;
        Insertionsort(arr, n );
         
        for(int num : arr )
        {
            System.out.println((num + " "));
        }

    }
}