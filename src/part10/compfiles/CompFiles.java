package part10.compfiles;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by alebul on 22.11.16.
 */
public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        if(args.length != 2) {
            System.out.println("How to: CompFiles file1 file2");
            return;
        }

        try(FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) {
                    break;
                }
            } while (i != -1 && j != -1);

            if(i != j) {
                System.out.println("Files is different");
            }
            else {
                System.out.println("Files is equealse");
            }
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}