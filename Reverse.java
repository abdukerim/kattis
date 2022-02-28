
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[lines];
        for (int i = 0; i < lines; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = arr.length- 1;i >= 0;  i--) {
            System.out.println(arr[i]);
        }
    }
}
