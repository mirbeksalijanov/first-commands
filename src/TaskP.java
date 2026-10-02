import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Первый момент времени
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        // Второй момент времени
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        // Переводим оба момента времени полностью в секунды с начала суток
        int totalSeconds1 = h1 * 3600 + m1 * 60 + s1;
        int totalSeconds2 = h2 * 3600 + m2 * 60 + s2;

        // Находим разницу
        int diff = totalSeconds2 - totalSeconds1;

        System.out.println(diff);
    }
}
