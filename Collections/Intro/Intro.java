package Collections.Intro;

public class Intro {
    public static void main(String[] args) {
        //variable declaration variable only store one value at a time
        int x = 10;
        //array declaration array store multiple values at a time but of same type
        int i[]={1,2,3,4,5};
        //object array declaration object array store multiple values at a time but of different type this will run without any error beccause data can be inplicitly typecasted
        Object [] arr={1,2,3,4,5,"hello",true,3.14};
        //this will give error because arr[1] is of type object and we are trying to add 5 to it
        int a=arr[1]+5;

        // Disadavanatges of array
        // 1. Array is of fixed size    
        // 2. Array can store only one type of data 
        // 3. Array can store only primitive data types
        // 4. Array can store only objects of same type
      

        //Collection Framework
        // Collection Framework is a set of classes and interfaces that are used to store and manipulate a group of objects
        // Collection Framework is a unified architecture for representing and manipulating collections
        // Collection Framework is a set of classes and interfaces that are used to store and manipulate a group of objects

        //Advantages of Collection Framework
        // 1. Collection Framework is growable in nature
        // 2. Collection Framework can store any type of data
        // 3.Multiple data structures are available in Collection Framework
        // 4.Readymade methods are available in Collection Framework



    }
}
