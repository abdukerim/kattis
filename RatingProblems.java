import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = scanner.nextLine().split(" ");
        int totalJudges = Integer.parseInt(lines[0]);
        int voted = Integer.parseInt(lines[1]);
        int[] votes = new int[voted];
        for (int i = 0; i < votes.length; i++) {
            votes[i] = scanner.nextInt();
        }
        int sum = sumOfArray(votes);
        double possibleMin = (double) ((totalJudges - voted) * -3 + sum) / totalJudges;
        double possibleMax = (double) ((totalJudges - voted) * 3 + sum) / totalJudges;
        System.out.println(possibleMin + " " + possibleMax);

    }
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return  sum;
    }
}
