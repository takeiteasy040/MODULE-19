import java.util.Scanner;

public class prexe4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        String result = arr[0] + arr[arr.length - 1];

        System.out.println("Concatenated String = " + result);

        sc.close();
    }
}