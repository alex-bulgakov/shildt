package part5;

/**
 * Created by alebul on 11.11.16.
 */
public class Arguments {
    public static void main(String[] args) {
        System.out.println("Программе передано " + args.length + " аргументов коммандной строки.");
        System.out.println("Списко аргументов: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }
}
