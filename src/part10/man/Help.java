package part10.man;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alebul on 24.11.16.
 */
public class Help{
    String helpfile;

    public Help(String helpfile) {
        this.helpfile = helpfile;
    }

    boolean helpon(String what) {
        int ch;
        String topic, info;

        try(BufferedReader reader = new BufferedReader(new FileReader(helpfile))) {
            do {
                ch = reader.read();

                if(ch == '#') {
                    topic = reader.readLine();
                    if(what.equals(topic)) {
                        do {
                            info = reader.readLine();
                            if(info != null) {
                                System.out.println(info);
                            }
                        } while((info != null) && (!info.equals("")));
                        return true;
                    }
                }
            } while(ch != -1);
        }
        catch (IOException e) {
            System.out.println("Error access to help file");
            return false;
        }
        return false;
    }

    String getSelection() {
        String topic = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter topic: ");

        try {
            topic = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error read from console");
        }
        return topic;
    }

}
