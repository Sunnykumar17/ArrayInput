import java.util.Scanner;

public class inputArray {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of size");
        int size = scn.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter number of values");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}