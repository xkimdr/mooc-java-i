
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(2, 10);

        scanner.close();
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; ++i) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}
