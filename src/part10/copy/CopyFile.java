package part10.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by alebul on 21.11.16.
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }
            }
            while (i != -1);
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);
        }

        try {
            if(fout != null) {
                fout.close();
            }
        } catch (IOException e) {
            System.out.println("Error out file close");
        }
    }
}
