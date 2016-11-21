package part6.test;

/**
 * Created by alebul on 13.11.16.
 */
public class ReverseString {
    static String result = "";
    static int i = 0;
    static void reverseString(String s) {
        int l = s.length();
        do {
            result += s.charAt(l - i);
            i++;
        } while (i < l);
    }

    public static void main(String[] args) {
        reverseString("Hello");
        System.out.println(result);
    }
}
