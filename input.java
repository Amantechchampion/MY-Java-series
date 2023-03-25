import java.util.*;

public class input {

    public static void main(String args[]) {
        // how to take input
        // 6 - object
        try (Scanner sc = new Scanner(System.in)) {
            String Anyname = sc.nextLine();
            System.out.println(Anyname);
        }

    }
}
