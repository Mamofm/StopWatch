import java.util.Scanner;

public class StopWatch {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        int limit;

        System.out.println("Enter a time in minutes.");
        limit = keybd.nextInt();

        while (limit >= 0) {
            for (int minutes=60; minutes >= 0; minutes--) {           // decrement minutes
                for (int seconds=60; seconds >= 0; seconds--) {      // decrement seconds
                    System.out.printf ("%2d:%2d:%2d \n",limit,minutes ,seconds);
                }
            }
            limit--;                                                // decrement hours
        }
        System.out.print ("Time Over!");
    }
}
