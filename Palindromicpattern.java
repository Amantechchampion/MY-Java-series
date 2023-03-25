public class Palindromicpattern {

    public static void main(String args[]) {

        int n = 5;
        // Outter loop
        for (int i = 1; i <= n; i++) {

            // to print SPACE
            int spaces = (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Inner loop -->1s half part = Backword
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            } // Inner loop -->2nd half part = forword
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}