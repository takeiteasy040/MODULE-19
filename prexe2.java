import java.util.Scanner;

public class prexe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            sum = sum + num;
        }

        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}