public class PrimitivePractice {
    public static void main(String[] args) {

        // Step 1: Declare the 8 Primitives
        byte by = 10;
        short s = 450;
        int i = 10;
        long l = 8000000000L;
        float f = 19.99f;
        double d = 3.1415926545893;
        char c = 'A';
        boolean bob = true; 

        //print 8 vars
        System.out.println("byte: " + by);
        System.out.println("short: " + s); 
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f); 
        System.out.println("double: " + d);
        System.out.println("char: " + c); 
        System.out.println("boolean: " + bob); 

        // Step 2: Practice Casting (Implicit & Explicit)

        byte smallVal = 50; 
        int largeVal = smallVal;

        System.out.println(smallVal);
        System.out.println(largeVal);

        double decimalVal = 99.99; 
        int truncatedVal = (int)decimalVal; 

        System.out.println(decimalVal);
        System.out.println(truncatedVal); 

        /* result: since int is a "smaller" size then double, double must lose some data/information in order to fit into the int data type.
        99.99 double lose the .99. sp truncated value become 99.*/


        // Step 3: Reference Variable Mutation Lab

        int a = 10; 
        int b = a;
        b = 20; 

        System.out.println(a);
        System.out.println(b); 

        // create an reference variable call firstArray of type int[] that point to an object being created of type int array
        int[] firstArray = new int[]{10,20,30};

        int[] secondArray = firstArray;

        secondArray[0] = 999;

        System.out.println(firstArray[0]);
        System.out.println(secondArray[0]);

        /*/
        When I create firstArray, it is a reference variable stored in the stack. 
        It holds the memory address of an array object,which is created in the heap.
        Java does not create another array. Instead, it copies the reference (memory address), 
        so both firstArray and secondArray point to the same array object in the heap. 
        I am modifying the object not the reference variable. 

        */













        










        
    }
    
}
