import java.util.Observable;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int n = Integer.parseInt(inputs[2]);
        fizzBuzz(x,y,n);

    }
    public static void fizzBuzz(int x,int y,int n) {
        for (int i = 1; i <= n; i++) {
            if(i % x == 0 && i % y == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % x == 0) {
                System.out.println("Fizz");
            }
            else if(i % y == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
