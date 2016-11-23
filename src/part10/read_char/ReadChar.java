package part10.read_char;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alebul on 23.11.16.
 */
public class ReadChar {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter symbols, dot is end of enter: ");

        do {
            c = (char) reader.read();
            System.out.println(c);
        } while(c != '.');
    }
}
