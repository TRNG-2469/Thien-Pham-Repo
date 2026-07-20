import java.util.Random;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        // create an array size 10 
        int[] singleDimensional = new int[10];

        // populated array with 10 randoms values 
        for(int i = 0; i < singleDimensional.length; i++){
            //using the random module to populate array with 10 random elements 
            Random random_nums = new Random();
            // at each index place the random number into the array
            singleDimensional[i] = random_nums.nextInt(100) + 1; 
            System.out.print(singleDimensional[i] + " ");


        }

        //implement calculation loops

        // sum loops 
        int sumResult = 0; 
        for(int i = 0; i <singleDimensional.length; i++){
            // add the result to sumResult
            sumResult += singleDimensional[i]; 
        }

        int minNum = singleDimensional[0]; 
        for(int i = 0; i <singleDimensional.length; i++ ){
            if (minNum > singleDimensional[i]){
                
                minNum = singleDimensional[i];    
            }
        }

        
        int maxNum = singleDimensional[0]; 
        for(int i = 0; i <singleDimensional.length; i++ ){
            if (maxNum < singleDimensional[i]){
                
                maxNum= singleDimensional[i];    
            }
        }



        System.out.println(" ");

        // sum
        System.out.println("Sum: " + sumResult);

        //average
        double avg = (double)sumResult/10;
        System.out.println("Average: " + avg);

        //minimum
        System.out.println("Minimum: " + minNum);

        // maximum
        System.out.println("Max: " + maxNum);

         



    }
}
