
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 12, 2011);
        SimpleDate newDate = date.afterNumberOfDays(5);

        System.out.println(newDate.toString());
    }
}
