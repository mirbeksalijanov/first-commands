import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long v = sc.nextLong();
        long t = sc.nextLong();
        System.out.println(((v * t) % 109 + 109) % 109);
    }
}