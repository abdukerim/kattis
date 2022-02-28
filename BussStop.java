import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BussStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] A = new int[n];
        String[] numbers = scanner.nextLine().split(" ");
        for (int i = 0; i < numbers.length; i++) {
            A[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(A);
        for (ArrayList<Integer> list : printSubArr(A,0,0)) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static ArrayList<ArrayList<Integer>> printSubArr(int[] arr,int start, int end) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(end == arr.length) {
            return null;
        }
        else if(start > end) {
            printSubArr(arr,0,end+1);
        }
        else {
            //System.out.print(" ");
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = start; i < end; i++) {
                //System.out.print(arr[i] + ",");
                nums.add(arr[i]);
            }
            nums.add(arr[end]);
            result.add(nums);
            //System.out.println(arr[end]);
            printSubArr(arr,start+1,end);
        }
        return result;
    }
}
