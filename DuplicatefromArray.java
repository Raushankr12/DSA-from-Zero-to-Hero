// Remove the Duplicate of a elements of a array.

import java.util.Scanner;

public class DuplicatefromArray {

    public static void main(String a[]) {

        int arr[] = new int[8];
        Scanner r = new Scanner(System.in);

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < 8; ++i)
            arr[i] = r.nextInt();

        int array[] = new int[8];
        array[0] = arr[0];
        int x = 0;

        for (int i = 1; i < 8; ++i) {
            if (array[x] != arr[i]) {
                x = x + 1;
                array[x] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i <= x; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
