package part10.read_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by alebul on 21.11.16.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if(args.length > 1) {
            System.out.println("Использование чтения из файла: " + args[0]);
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Укажите название файла");
            return;
        }


        try {
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            }
            while(i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

    }
}
