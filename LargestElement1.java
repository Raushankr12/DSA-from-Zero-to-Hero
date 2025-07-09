// Find the Largest element of the Array by taking Input from user.

import java . util. Scanner;
 
public class LargestElement1 {
    
    public static void main (String args[]){

        int size = 5;

        int array[] = new int [size];      // create array + initialize the array

        System.out.print("enter the elements of Array = ");


        Scanner obj = new Scanner(System.in);
        
        for(int i= 0; i<size ; i++){

        

         array[i] = obj.nextInt();
        
        }

        int Largest = array[0];

        for(int i = 1; i<size ; i++){

            if(array[i]> Largest);

            Largest = array[i];


        }

        System.out.println("Largest Number = " +Largest);







    }
}
