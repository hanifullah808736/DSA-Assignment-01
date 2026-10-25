import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] first = new int[5];
        int[] second = new int[5];
        int[] merged = new int[10];

        System.out.println("Enter 5 integers for the first sorted array:");
        for (int i = 0; i < first.length; i++) {
            first[i] = input.nextInt();
        }

        System.out.println("Enter 5 integers for the second sorted array:");
        for (int i = 0; i < second.length; i++) {
            second[i] = input.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;

     

        System.out.println("Merged sorted array:");
        for (int index = 0; index < merged.length; index++) {
            System.out.print(merged[index] + " ");
        }
        System.out.println();

        input.close();
    }
}
