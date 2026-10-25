import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // TODO: Use Bubble Sort to arrange numbers in ascending order.
        // Compare adjacent elements and swap them when needed.

        System.out.println("Ascending order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Descending order:");
        // TODO: Display the sorted array from the last index to the first.

        input.close();
    }
}
