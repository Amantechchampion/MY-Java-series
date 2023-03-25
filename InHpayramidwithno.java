public class InHpayramidwithno {

    public static void main(String args[]) {

        int n = 7;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
            // also to print same pattern we can write: for(int j=1; j=n-i+1; j++)
            // Explaination: jb 1) me i=1 tb 5-1+1=5
            // 2) me i=2 tb 5-2+1=4
            // 3) me i=3 tb 5-3+1=3
            // 4) me i=4 tb 5-4+1=2
            {
                System.out.print(j + " "); // <--We can add any value by + in the same line
            }
            System.out.println();
        }
    }
}
