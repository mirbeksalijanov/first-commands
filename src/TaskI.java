import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = n / 100;         // Первая цифра (сотни)
        int b = (n / 10) % 10;   // Вторая цифра (десятки)
        int c = n % 10;          // Третья цифра (единицы)

        int sum = a + b + c;

        System.out.println(sum);
    }
}
