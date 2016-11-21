package part6.vargs;

/**
 * Created by alebul on 12.11.16.
 */
public class Varargs {
    static void vaTest(int ... v) {
        System.out.println("Nums of args: " + v.length);
        System.out.println("Entiers: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }
}
