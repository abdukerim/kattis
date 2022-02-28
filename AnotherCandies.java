import java.util.Scanner;

public class AnotherCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < tests; i++) {
            scanner.nextLine();
            int sum = 0;
            int n = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < n; j++) {
                sum += Integer.parseInt(scanner.nextLine());
            }
            if(sum % n == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
