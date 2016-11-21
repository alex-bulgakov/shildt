package part5;

/**
 * Created by alebul on 11.11.16.
 */
public class Encode {
    public static void main(String[] args) {
        String msg = "Это тестовое сообщение для проверки шифрования через XOR";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefjs";
        int length = msg.length();
        int j = 0;

        System.out.println("Исходное сообщение: ");
        System.out.println(msg);

        for (int i = 0; i < length; i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j == 8) {
                j = 0;
            }
        }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        for (int i = 0; i < length; i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j == 8) {
                j = 0;
            }
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
