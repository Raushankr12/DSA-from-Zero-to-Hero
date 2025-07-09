// find the Largest Element of the array

import java . util.Scanner;

public class LargestElement2 {

    public static void main(String a[]){

        Scanner obj = new Scanner(System.in);

        System.out.println("enter the size of array");

       int size = obj.nextInt();

       int array[] = new int [size];

        System.out.println("enter the element of array");

        for(int i = 0; i<size; ++i){

            array[i] = obj.nextInt();

        }

        

        int Largest = array[0];

        for(int i = 0; i<size; ++i){

            if(array[i]>Largest)

            Largest = array[i];
        }

        System.out.println("larget element = " +Largest);
        


    }
}
