import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] first = new int[5];
        int[] second = new int[5];
        int[] merged = new int[10];

        System.out.println("Enter 5 integers for the first array in ascending order:");
        for (int i = 0; i < first.length; i++) {
            first[i] = input.nextInt();
        }

        System.out.println("Enter 5 integers for the second array in ascending order:");
        for (int i = 0; i < second.length; i++) {
            second[i] = input.nextInt();
        }

        // TODO: Copy all elements of first into merged.
        // TODO: Copy all elements of second after the first array's elements.

        System.out.println("Merged array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println();

        // TODO: Find the largest element in merged and display it.

        input.close();
    }
}
