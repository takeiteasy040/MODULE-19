public class prexe1 {
    public static void main(String[] args) {

        String[] arr = {"Apple", "Mango", "Banana"};

        arr[1] = "Orange";

        for (String fruit : arr) {
            System.out.println(fruit);
        }
    }
}