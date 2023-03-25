public class Piiinvertedhpyramid {

    public static void main(String args[]) {

        int n = 7;
        // Outter loop
        for (int i = 1; i <= n; i++) {
            // 1st Inner loop to print SPACE : n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 2nd Inner loop to print STAR : i
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
