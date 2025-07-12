// Reverse an array 

import java .util. Scanner ;

public class ReverseArray {
   public static void main(String a[]) {

    int array[] = new int [5];

    Scanner sc = new Scanner(System.in);


    System.out.println("enter the elemennts of array");

    for(int i=0; i<5; i++){

         array[i] =  sc.nextInt();

        
    }

    System.out.println("  Reverse Array element ");

     for(int i=5-1; i>=0; i--){

        

        System.out.println(array[i]);
    }

    System.out.println(" Array element ");

    for( int i=0; i<5; i++){

        

        System.out.println(array[i]);




}
}
}