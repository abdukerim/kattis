import java.util.ArrayList;
import java.util.Scanner;

public class DifferentProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> result = new ArrayList<>();
        while (scanner.hasNext()) {
            String[] inputs = scanner.nextLine().split(" ");
            result.add(Math.abs(Long.parseLong(inputs[0]) - Long.parseLong(inputs[1])));
        }
        scanner.close();
        for (long l : result) {
            System.out.println(l);
        }
    }
}
