import java.util.*;

public class Printstar {

    public static void main(String args[]) {
        System.out.println("Enter the value of m and n:");
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            // Outter loop:
            for (int i = 1; i <= m; i++) {
                // Inner loop:
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}