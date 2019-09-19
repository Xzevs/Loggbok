import java.util.ArrayList;
import java.util.Scanner;


public class loggbok {
    public static void main(String[] args) {
        ArrayList<LogEntry> post =new ArrayList<LogEntry>();
        Scanner tgb = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            running = choose (post, tgb);

        }



    }

    private static void printMenu() {
        System.out.println("Välj:"+"\n"
                + "1. Visa loggbok \n"
                + "2. Lägg till i loggbok \n"
                + "3. Redigera \n"
                + "4. Spara \n"
                + "5. Läs in \n"
                +"6. Avsluta \n "

        ) ;



    }
}
