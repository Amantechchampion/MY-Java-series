import java.util.*;

public class table {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 2; i < 11; i++) {

                System.out.println(i * n);
            }
        }
    }
}