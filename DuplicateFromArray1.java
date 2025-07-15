// Remove Duplicate from Sorted Array.



public class DuplicateFromArray1 {
    public static void main(String arg[]) {
        int arr[] = { 2, 3, 4, 4, 5, 6, 6, 7, 8, 8 };
        int array[] = new int[arr.length];

        

        array[0] = arr[0];
        int x = 0;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != array[x]) {
                x = x + 1;
                array[x] = arr[i];
            }
        }

        for (int i = 0; i <= x; ++i) {
            System.out.println("after removing duplicate elements = " + array[i]);
        }
    }
}
