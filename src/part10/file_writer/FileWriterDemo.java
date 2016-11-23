package part10.file_writer;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alebul on 23.11.16.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("stop - is the end of entering");

        try (FileWriter fw = new FileWriter("/media/projects/shildt/src/part10/file_writer/test.txt")) {
            do {
                System.out.print(": ");
                s = reader.readLine();

                if(s.equals("stop")) {
                    break;
                }

                s += "\r\n";
                fw.write(s);
            } while(!s.equals("stop"));
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
    }
}
