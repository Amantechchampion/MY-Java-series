public class Solidrhombuspattern {

    public static void main(String args[]) {

        int n = 5;
        // Outter loop
        for (int i = 1; i <= n; i++) {

            // to print SPACE in the starting
            int spaces = (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Inner loop --> To print right half part-STAR
            for (int j = 1; j <= 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}