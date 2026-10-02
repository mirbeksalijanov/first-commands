import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Маленьких перемен (по 5 минут) прошла n / 2
        // Больших перемен (по 15 минут) прошло (n - 1) / 2
        int totalMinutes = n * 45 + (n / 2) * 5 + ((n - 1) / 2) * 15;

        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
    }
}
