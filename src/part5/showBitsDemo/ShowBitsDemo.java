package part5.showBitsDemo;

/**
 * Created by alebul on 11.11.16.
 */
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n34120 в двоичном представлении: ");
        i.show(34120);

        System.out.println("\n93483772 в двоичном представлении: ");
        li.show(93483772);

    }
}
