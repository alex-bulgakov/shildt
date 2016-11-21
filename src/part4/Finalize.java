package part4;

/**
 * Created by root on 09.11.16.
 */
public class Finalize {
    public static void main(String[] args) {
        FDemo ob = new FDemo(0);

        for (int l = 0; l < 1000000; l++) {
            ob.generator(l);
        }
    }
}
