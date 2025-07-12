// SUM OF ELEMENTS OF ARRAY

import java .util.Scanner;

public class SumArray {

    public static void main( String a[]){

        int array [] = new int [5];

        Scanner r = new Scanner (System.in);

        System .out.print("\nenter the elemnets of array =");

        for(int i = 0; i<array.length; i++){

            array[i] = r.nextInt();


        }

        System.out.println("Sum of array = ");

        int sum = 0;

        for( int i =0; i<5;i++){

            System.out.println(array[i] +" ");

            sum = array[i]+ sum;        }

            System.out.println("Addition = "+sum);


    }
    
}
