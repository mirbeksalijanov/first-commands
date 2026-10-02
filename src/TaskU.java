import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Остаток от деления n на m и остаток от деления m на n
        int rem1 = n % m;
        int rem2 = m % n;

        // Если одно число делится на другое, то rem1 * rem2 будет равно 0.
        // Добавляем 1, чтобы получить 1 при делимости без остатка.
        int result = (rem1 * rem2) + 1;

        System.out.println(result);
    }
}
