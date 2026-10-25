import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = input.nextInt();
        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] == target) {
                System.out.println("Found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }

        input.close();
    }
}
