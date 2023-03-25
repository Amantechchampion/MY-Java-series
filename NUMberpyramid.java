public class NUMberpyramid {

    public static void main(String args[]) {

        int n = 5;
        // Outter loop
        for (int i = 1; i <= n; i++) {

            // to print SPACE
            int spaces = (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Inner loop --> Print row no, row no. times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}