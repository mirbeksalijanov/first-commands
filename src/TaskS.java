import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // В последний день улитка совершит финальный рывок на 'a' метров.
        // До этого дня ей нужно преодолеть путь длиной (h - a) метров.
        // За каждый полный день + ночь она поднимается на (a - b) метров.
        int days = 1 + (h - a + (a - b) - 1) / (a - b);

        System.out.println(days);
    }
}