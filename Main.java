import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create an example array
        Integer[] exampleArray = {1, 2, 9};

        // Call getDifference method
        getDifference(exampleArray);

        // Call getDifferenceWithLoop
        getDifferenceWithLoop(exampleArray);

        // Call findSmallestAndSecondSmallest method
        findSmallestAndSecondSmallest(exampleArray);

        // Call calculateExpressionWithLoop method
        calculateExpressionWithLoop(2.0, 4.0);
    }

    // Method to calculate the difference between the largest and smallest elements in an array
    public static int getDifference(Integer[] arr) {
        List<Integer> numbers = new ArrayList<>(); // Initializing the list
        Collections.addAll(numbers, arr); // Populating the list with array elements

        int max = Collections.max(numbers); // Getting the maximum value
        int min = Collections.min(numbers); // Getting the minimum value

        System.out.println("The difference: " + (max - min));
        return max - min;
    }

    // Method to calculate the difference between the largest and smallest elements in an array using loops
    public static int getDifferenceWithLoop(Integer[] array) {
        Integer max = array[0];
        Integer min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Difrerence is: " + (max - min));
        return max - min;
    }

    // Method to find the smallest and second smallest elements in an array
    public static void findSmallestAndSecondSmallest (Integer[] arr) {
        List<Integer> numbers = new ArrayList<>(); // Initializing the list
        Collections.addAll(numbers, arr); // Populating the list with array elements

        Collections.sort(numbers);
        System.out.println("Smallest and second smallest elements are: " + numbers.get(0) + " and " + numbers.get(1));
    }

    // Method to calculate a mathematical expression with a loop
    public static double calculateExpressionWithLoop (double x, double y) {
        double result = 0.0;

        double xPow = x*x;
        double loopVariable = 1;

        for(int i=0; i < 2; i++){
            loopVariable = loopVariable * (4*y/5 - x);
        }

        result = xPow + loopVariable;

        System.out.println(result);
        return result;

        /* Another solution without loops
        double xSquared = Math.pow(x,2);

        double innerTerm = (4*y/5-x);
        double innerTermSquared = Math.pow(innerTerm, 2);

        result = xSquared + innerTermSquared;
         */
    }

}
