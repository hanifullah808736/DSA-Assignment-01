import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int min = numbers[0], max = numbers[0];
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        int secondMin = 0, secondMinIndex = -1;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > min &&
                (secondMinIndex == -1 || numbers[i] < secondMin)) {
                secondMin = numbers[i];
                secondMinIndex = i;
            }
        }

        System.out.println("Minimum: " + min + ", Index: " + minIndex);
        System.out.println("Maximum: " + max + ", Index: " + maxIndex);

        if (secondMinIndex != -1) {
            System.out.println("Second Minimum: " + secondMin +
                               ", Index: " + secondMinIndex);
        } else {
            System.out.println("No distinct second minimum found.");
        }

        input.close();
    }
}
