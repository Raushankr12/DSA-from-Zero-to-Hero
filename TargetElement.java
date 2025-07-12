// Find the occourence of target elements in  Array

import java .util. Scanner;


public class TargetElement {
   public static void main(String a[]){ 
    int array[ ] = new int[6];

    Scanner sc = new Scanner(System.in);

    System.out.println("eneter the elements of  array");

    for(int i = 0; i<6; i++){

        array[i]= sc.nextInt();

    }
    System.out.print("\nenter the target element = ");

    int target = sc.nextInt();;

    int count = 0;

    for(int i = 0; i < 6; ++i){

        if (array[i] == target)

        

        

        


        count = count+1;
    }

   
    System.out.println("count = "+count);



}

}