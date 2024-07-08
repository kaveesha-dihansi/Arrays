import java.security.interfaces.EdECKey;
import java.util.Scanner;

public class pro17 {
    public static void main(String[] args) {
        final int SIZE = 7;
        String[] days = new String[SIZE];
        Scanner my = new Scanner(System.in);

        for(int i = 0; i < SIZE; i++) {
            System.out.println("enter your day :");
            days[i] = my.nextLine();
        }

        for(String name : days) {
            System.out.println(name);
        }
        
    }
}