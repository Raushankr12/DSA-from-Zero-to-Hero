// Find the Largest Elements of a array

public class LargestElement {
    
    public static void main( String rau[]){

    

    int Largest;

    int array[]= { 20 , 30, 50, 58, 60};

    Largest = array[0] ;

    for(int i = 1; i<array.length; i++){


        if(array[i]>Largest);

        Largest = array[i];
    }

    System.out.println("Larget Elemennt = " +Largest);

}

}
