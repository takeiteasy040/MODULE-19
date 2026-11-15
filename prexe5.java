import java.util.Scanner;

public class prexe5 {

    public static int compare(int[] arr) {
        return Math.max(arr[0], arr[1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int greatest = compare(arr);

        System.out.println("Greater element = " + greatest);

        sc.close();
    }
}