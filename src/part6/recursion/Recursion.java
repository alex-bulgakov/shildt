package part6.recursion;

/**
 * Created by alebul on 12.11.16.
 */
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Recursion: ");
        System.out.println("!3 = " + f.factR(3));
        System.out.println("!4 = " + f.factR(4));
        System.out.println("!5 = " + f.factR(5) + "\n");

        System.out.println("Iteration: ");
        System.out.println("!3 = " + f.factI(3));
        System.out.println("!4 = " + f.factI(4));
        System.out.println("!5 = " + f.factI(5));


    }
}
