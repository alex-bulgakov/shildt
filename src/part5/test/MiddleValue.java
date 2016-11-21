package part5.test;

/**
 * Created by alebul on 11.11.16.
 */
public class MiddleValue {
    public static void main(String[] args) {
        double[] arr = {2.3, 64.34, 20, 4, 6.94, 3.2, 93.2, 73.4, 7.2, 7.21};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nСреднее арифметическое: " + (sum/arr.length));
    }
}
