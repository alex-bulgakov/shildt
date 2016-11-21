package part6.qsort;

/**
 * Created by alebul on 12.11.16.
 */
public class QSDemo {
    public static void main(String[] args) {
        int[] n = {34, 32,64, -34, 4, 93, -39, 453, 0, 31};

        System.out.println("Source array: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        Qsort.qsort(n);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
