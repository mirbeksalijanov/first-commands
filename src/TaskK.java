import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // В сутках 1440 минут (24 * 60)
        int minutesInDay = n % 1440;

        int hours = minutesInDay / 60;
        int minutes = minutesInDay % 60;

        System.out.println(hours + " " + minutes);
    }
}