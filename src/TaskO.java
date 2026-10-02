import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();


        int priceInKopecks = a * 100 + b;


        int totalKopecks = priceInKopecks * n;


        int totalRubles = totalKopecks / 100;
        int remainingKopecks = totalKopecks % 100;

        System.out.println(totalRubles + " " + remainingKopecks);
    }
}
