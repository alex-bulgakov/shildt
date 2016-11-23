package part10.rw_data;

import java.io.*;

/**
 * Created by alebul on 22.11.16.
 */
public class RWData {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 10;
        double d = 1023.56;
        boolean b =true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Write: " + i);
            dataOut.writeInt(i);

            System.out.println("Write: " + d);
            dataOut.writeDouble(d);

            System.out.println("Write: " + b);
            dataOut.writeBoolean(b);
        } catch (IOException e) {
            System.out.println("Error writing");
            return;
        }

        System.out.println();

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {
            i = dataIn.readInt();
            System.out.println("Read: " + i);

            d = dataIn.readDouble();
            System.out.println("Read: " + d);

            b = dataIn.readBoolean();
            System.out.println("Read: " + b);
        } catch (IOException e) {
            System.out.println("Error reading");
        }
    }
}
