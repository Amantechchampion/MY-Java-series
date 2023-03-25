public class hollowpattern {

    public static void main(String args[]) {
        int n = 6;
        int m = 7;

        // Outter loop:
        for (int i = 1; i <= n; i++) {
            // Inner loop:
            for (int j = 1; j <= m; j++) {
                // cell i,j
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {

                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
