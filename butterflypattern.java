public class butterflypattern {

    public static void main(String args[]) {

        int n = 13;
        // Outter loop of upper part
        for (int i = 1; i <= n; i++) {
            // Inner loop --> To print left half of upper part-STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // to print SPACES b/w both left and right part
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Inner loop --> To print right half of upper part-STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Outter loop of lower part
        for (int i = n; i >= 1; i--) {
            // Inner loop --> To print left half of lower part-STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // to print SPACES b/w both left and right part
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Inner loop --> To print right half of lower part-STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
