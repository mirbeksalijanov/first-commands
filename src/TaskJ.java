import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int nextEven = n + 2 - (n % 2);

        System.out.println(nextEven);
    }
}
