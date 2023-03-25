public class Diamondpattern {

    public static void main(String args[]) {

        int n = 17;
        // Outter loop
        for (int i = 1; i <= n; i++) {

            // to print SPACE
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Inner loop --> Upper part
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // to print SPACE
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Inner loop --> lower part
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}