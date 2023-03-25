public class dowhileloop {

    public static void main(String args[]) {

        int i = 0;
        do {
            System.out.println(i);
            i = i + 1; // i=i++

        } while (i <= 100); // here in this last syntax statement, semicolon is use always after ")" braces.
                            // // but it does not written on whileloop or forloop syntax

        // int i = 20;
        // do {
        // System.out.println("Aman Jain");
        // i = i + 1;

        // } while (i < 19);

        // here in do while loop, first it will check then print so in above ex we have
        // saw (which is wrong) that the value (i<19) still it prints Aman Jain.}

    }
}