import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int size = 10;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter index to delete (0-9): ");
        int index = input.nextInt();

        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
        } else {
            // TODO: Shift elements after index one position left.

            // TODO: Decrease size by 1.

            System.out.println("Updated array:");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
