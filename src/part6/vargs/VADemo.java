package part6.vargs;

/**
 * Created by alebul on 12.11.16.
 */
public class VADemo {
    public static void main(String[] args) {
        Varargs.vaTest(12);
        Varargs.vaTest(3, 4, 5);
        Varargs.vaTest(-3, 0, 4, 3);
        Varargs.vaTest();
    }
}
