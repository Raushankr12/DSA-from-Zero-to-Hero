public class ArrayExample {
    public static void main (String args[]){

        // create array

        // declare the  array + initialise the array

        int marks[] = { 90, 80, 10 , 20, 50 , 75} ;

        // Declare the array

       // int failedStudentMarks[];

        // initialise the array 

        //int size = 4;

         
        // failedStudentMarks = new int [size];

         // Declare thhe array + intialise the array

         int size =4;

         int failedStudentMarks[] = new int [size];


         // How do you access the data
          
System.out.println(marks.length);
System.out.println(marks[0]);
System.out.println(marks[1]);
System.out.println(marks[2]);
System.out.println(marks[5]);
System.out.println(marks[marks.length-1]);


System.out.println(failedStudentMarks[0]);
System.out.println(failedStudentMarks[2]);
System.out.println(failedStudentMarks[3]);

         // How do you modify the elements of array  

         marks[0] = 100;

        // Print all the data of marks array ( array traverse)

        for(int i = 0; i < marks.length; i++) {
            System.out.println("the value of index"  +i +  "is"  + marks[i]);
        }

        // enhance loop // for each loop

        for(int value:marks){
            System.out.println(value);
        }





    }
}
