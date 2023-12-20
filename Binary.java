public class Binary{
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print spaces before each line
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print binary numbers for each line
            for (int k = 0; k < n - i; k++) {
                if ((k + i) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
