import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Refrig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int costA = 960;
        int numA = 13;
        int costB = 995;
        int numB = 14;
        int total = 150;
        int maxPossible;
        if(total % numA == 0) {
            maxPossible = total / numA;
        }
        else {
            maxPossible = (total / numA) + 1;
        }
        Map<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < maxPossible; i++) {
            for (int j = 0; j < maxPossible; j++) {
                if((i* numA + j*numB) > total) {
                    result.put(i,j);
                }
            }
        }

    }
}
