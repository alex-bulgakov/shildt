package part5;

/**
 * Created by alebul on 11.11.16.
 */
public class ShowBits {
    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
        for (int i = 128; i > 0; i=i/2) {
            if((val & i) != 0) {
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }
    }
}
