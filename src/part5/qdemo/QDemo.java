package part5.qdemo;

/**
 * Created by alebul on 10.11.16.
 */
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
        for (int j = 0; j < 32; j++) {
            bigQ.put((char) ('А' + j));
        }

        for (int j = 0; j < 32; j++) {
            ch = bigQ.get();
            if(ch != (char) 0) {
                System.out.println(ch);
            }
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        for (int j = 0; j < smallQ.q.length; j++) {
            System.out.println("Попытка сохранения " + (char) ('Я' - j));

            smallQ.put((char) ('Я' - j));
            System.out.println();
        }

        System.out.println();

        System.out.print("Содержимое smallQ: ");
        for (int j = 0; j < smallQ.q.length; j++) {
            ch = smallQ.get();

            if(ch != (char) 0) {
                System.out.println(ch);
            }
        }
    }
}
