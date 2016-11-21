package part4;

/**
 * Created by root on 09.11.16.
 */
public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Финализация " + x);
    }

    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
