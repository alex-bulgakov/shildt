package part10.random_access;

import java.io.*;

/**
 * Created by alebul on 22.11.16.
 */
public class RandomAccess {
    public static void main(String[] args) {
        double[] data = {3.3, 22.64, 4.8, 39.345, 1.234, 98.3, 84.2};
        double d;


        try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            raf.seek(0);
            d = raf.readDouble();
            System.out.println("Value 1: " + d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Value 2: " + d);

            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("Value 3: " + d);

            System.out.println();

            System.out.println("Read odd lines: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8*i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
