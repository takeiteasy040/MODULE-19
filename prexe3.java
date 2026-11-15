import java.util.Scanner;

public class prexe3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        double result = Math.sqrt(arr[1]);

        System.out.println("Square root of second element = " + result);

        sc.close();
    }
}