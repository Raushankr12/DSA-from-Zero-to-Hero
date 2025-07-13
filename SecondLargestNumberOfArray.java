// Find the Second Largest Number of Array in Java
import java.util.Scanner;

public class SecondLargestNumberOfArray {

    public static void main(String a[]) {

        int arr[] = new int[6];

        System.out.println("enter the elements of array = ");

        Scanner x = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
            arr[i] = x.nextInt();

        int largest, secondLargest;

        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }

        for (int i = 2; i < 6; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("secondLargest = " + secondLargest);
    }
}
