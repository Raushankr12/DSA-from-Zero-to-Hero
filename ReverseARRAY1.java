// Reverse an Array 

import java .util. Scanner ;

public class ReverseARRAY1 {
   
    public static void main(String a[]) {

    int array[] = new int [5];

    Scanner sc = new Scanner(System.in);


    System.out.println("enter the elemennts of array");

    for(int i=0; i<array.length; i++){

         array[i] =  sc.nextInt();

        
    }

    System.out.println("  Reverse Array element ");

     for(int i=array.length-1; i>=0; i--){

        

        System.out.println(array[i]);
    }

    System.out.println(" Array element ");

    for( int i=0; i<array.length; i++){

        

        System.out.println(array[i]);




}
}
}

