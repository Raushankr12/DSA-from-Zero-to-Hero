// Check Array is Sorted or not

import java.util.Scanner;

public class CheckSortedArray {

    public static void main(String a[]) {

        int arr[] = new int[6];

        System.out.println("enter the elements of array = ");

        Scanner x = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
            arr[i] = x.nextInt();

        Boolean result = true;
        boolean result1 = false;

        for (int i = 0; i < 6 - 1; ++i) {

            if (arr[i] < arr[i + 1])
                System.out.println("result = " + true);

            else if (arr[i] > arr[i + 1]) {
                result = false;
                System.out.println("result1 = " + false);
                break;
            }
        }

        // 🔴 Final output
        if (result==true)
            System.out.println("Array is sorted in ascending order.");

        else

            System.out.println("Array is NOT sorted in ascending order.");
    }
}
