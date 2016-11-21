package part5.test;

/**
 * Created by alebul on 11.11.16.
 */
public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"hello", "hi", "s", "sdfsdf", "oeibu", "ycuken"};

        int a, b;
        String t;
        int size = strings.length;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + strings[i]);
        }
        System.out.println();

        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if(strings[b-1].compareTo(strings[b]) > 0) {
                    t = strings[b-1];
                    strings[b-1] = strings[b];
                    strings[b] = t;
                }
            }
        }

        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + strings[i]);
        }
        System.out.println();
    }
}
