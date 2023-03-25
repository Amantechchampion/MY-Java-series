import java.util.*;

public class ifelseif {
    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int aman = sc.nextInt();
            int ekta = sc.nextInt();

            if (aman == ekta) {
                System.out.println("both are equal");
            } else if (aman < ekta) {
                System.out.println("ekta moti hai aman se");
            } else {
                System.out.println("aman mota h ekta se");
            }
        }
    }
}
