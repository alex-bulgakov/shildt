package part10.read_lines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alebul on 23.11.16.
 */
public class ReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;

        System.out.println("Enter lines, end of enter - stop: ");

        do {
            s = reader.readLine();
            System.out.println(s);
        } while(!s.equals("stop"));
    }
}
