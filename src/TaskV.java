import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int k = ((a / b) + 2) / ((a / b) + 1) - 1;
        int max = a * k + b * (1 - k);

        System.out.println(max);
    }
}
