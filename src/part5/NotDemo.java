package part5;

/**
 * Created by alebul on 11.11.16.
 */
public class NotDemo {
    public static void main(String[] args) {
        byte b = -87;

        for (int i = 128; i > 0; i = i/2) {
            if((b & i) != 0) {
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }
        System.out.println();

        b = (byte) ~b;

        for (int i = 128; i > 0; i = i/2) {
            if((b & i) != 0) {
                System.out.print("1 ");
            }
            else {
                System.out.print("0 ");
            }
        }


    }
}
