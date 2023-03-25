public class hollowtriangle {

    public static void main(String args[]) {

        int n = 15;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {

                if ((n + 1) - i == j || ((n + i) - 1 == j) || i == n)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}