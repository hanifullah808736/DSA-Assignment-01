import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Duplicate values and occurrence counts:");

        // TODO: Visit each element in the array.
        // TODO: Check whether the value appeared at an earlier index.
        // TODO: If it did not, count its total occurrences.
        // TODO: Display the value only if its count is greater than 1.

        input.close();
    }
}
