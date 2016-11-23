package part10.print_writer;

import java.io.PrintWriter;

/**
 * Created by alebul on 23.11.16.
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d= 34.456;

        pw.println("Using PrintWriter class");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + (i+d));
    }
}
