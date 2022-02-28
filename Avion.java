import java.util.ArrayList;
import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        String[] inputs = new String[5];
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            inputs[i] = scanner.nextLine();
            if(containFBI(inputs[i])) {
                result.add(i+1);
            }
        }
        if(result.isEmpty()) {
            System.out.println("HE GOT AWAY!");
        }
        else {
            for (int i : result) {
                System.out.print( i + " ");
            }
        }

    }
    static boolean containFBI(String s) {
        String fbi = "FBI";
        for (int i = 0; i < s.length() - 2; i++) {
            if(s.substring(i,i+3).equals(fbi)) {
                return true;
            }
        }
        return false;
    }
}
