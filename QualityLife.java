import java.util.Scanner;

public class QualityLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        double[][] qualityArray = new double[lines][2];
        for (int i = 0; i < lines; i++) {
            String[] eachLine = scanner.nextLine().split(" ");
            double index = Double.parseDouble(eachLine[0]);
            double years = Double.parseDouble(eachLine[1]);
            qualityArray[i][0] = index;
            qualityArray[i][1] = years;
        }

        scanner.close();
        System.out.println(sumOfDoubleArray(qualityArray));


    }
    public static double sumOfDoubleArray(double[][] doubleArr) {
        double sum = 0;
        double[] arr = new double[doubleArr.length];
        for(int i = 0;i < doubleArr.length;i++) {
            arr[i] = doubleArr[i][0] * doubleArr[i][1];
        }
        for(double i : arr) {
            sum += i;
        }

        return sum;
    }


}
