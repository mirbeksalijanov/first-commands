import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Разбиваем число на 4 цифры (с учетом возможных ведущих нулей)
        int d1 = n / 1000;          // Первая цифра (тысячи)
        int d2 = (n / 100) % 10;    // Вторая цифра (сотни)
        int d3 = (n / 10) % 10;     // Третья цифра (десятки)
        int d4 = n % 10;            // Четвертая цифра (единицы)

        // У симметричного числа (палиндрома):
        // d1 должно быть равно d4, а d2 должно быть равно d3.
        // Если d1 != d4, то (d1 - d4) != 0, а разность по модулю Math.abs > 0.
        // То же самое для (d2 - d3).
        // Добавляем 1, чтобы для симметричного числа получилось 1 + 0 + 0 = 1.
        int result = 1 + Math.abs(d1 - d4) + Math.abs(d2 - d3);

        System.out.println(result);
    }
}
