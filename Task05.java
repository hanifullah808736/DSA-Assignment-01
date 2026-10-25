import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[11];
        int size = 10;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter index for insertion (0-10): ");
        int index = input.nextInt();

        System.out.print("Enter number to insert: ");
        int value = input.nextInt();

        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
        } else {
            // TODO: Shift elements right, starting from size - 1.
            // Stop shifting when you reach index.

            // TODO: Store value at numbers[index].
            size++;

            System.out.println("Updated array:");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
