package part10.man;

/**
 * Created by alebul on 24.11.16.
 */
public class FileHelp {
    public static void main(String[] args) {
        Help help = new Help("/media/projects/shildt/src/part10/man/help.txt");
        String topic;

        System.out.println("Use this help system.\n" + "For out from system enter - 'stop'.");

        do {
            topic = help.getSelection();

            if(!help.helpon(topic)) {
                System.out.println("Topic is not found.\n");
            }
        } while(!topic.equals("stop"));
    }
}
