
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int x = Integer.valueOf(scan.nextLine());

        scan.close();

        if (x == 1984) {
            System.out.println("Orwell");
        }
    }
}
