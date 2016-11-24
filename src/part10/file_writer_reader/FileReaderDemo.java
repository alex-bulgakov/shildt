package part10.file_writer_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alebul on 23.11.16.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            while((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
