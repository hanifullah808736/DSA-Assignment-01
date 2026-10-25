import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / 10;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Elements greater than average: " + count);

        input.close();
    }
}
