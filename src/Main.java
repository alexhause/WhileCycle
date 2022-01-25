import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        While();
        //For();
    }

    public static void For() {
        for (int i = 200000; i <= 235000; i++) {
            if (i >= 200000 && i <= 210000) System.out.println("Билет №: " + i);
            else if (i > 210000 && i < 220000) continue;
            else System.out.println("Билет №: " + i);
        }
    }

    public static void While() {
        int ticketNum = 200000;
        while (ticketNum <= 235000){
            if (ticketNum >= 200000 && ticketNum <= 210000) System.out.println("Билет №: " + ticketNum);
            else if (ticketNum >= 220000 && ticketNum <= 235000) System.out.println("Билет №: " + ticketNum);
            ticketNum++;
        }

    }
}
