public class Hpyramidwithno {

    public static void main(String args[]) {

        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // <--We can add any value by + in the same line
            }
            System.out.println();
        }
    }
}
