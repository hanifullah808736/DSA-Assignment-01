
import java.util.Scanner; // Imports keyboard input functionality.

public class Task02 { // Defines the Task02 class.
    public static void main(String[] args) { // Starts the main method.
        Scanner input = new Scanner(System.in); // Creates an input reader.

        int[] numbers = new int[10]; // Declares an array of 10 integers.

        // TODO 1: Read 10 integers into the array using a loop.

        int min = numbers[0]; // Initializes the minimum value.
        int max = numbers[0]; // Initializes the maximum value.
        int minIndex = 0; // Stores the index of the minimum.
        int maxIndex = 0; // Stores the index of the maximum.

        // TODO 2: Traverse the array to update min, max,
        // minIndex, and maxIndex.

        int secondMin = 0; // Stores the second minimum value.
        int secondMinIndex = -1; // -1 means it has not been found.

        // TODO 3: Find the smallest element greater than min.
        // Update secondMin and secondMinIndex when appropriate.

        // TODO 4: Display min, max, and their indices.
        // Display secondMin and its index if it was found.

        input.close(); // Closes the input reader.
    }
}
