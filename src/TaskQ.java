import java.util.Scanner;

public class TaskQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Формула округления вверх для целых чисел
        int days = (m + n - 1) / n;

        System.out.println(days);
    }
}