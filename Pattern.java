public class Pattern {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 4; // You can adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i == 1 || i == rows) && (j > 1 && j < 7)) {
                    System.out.print("*");
                } else if ((i > 1 && i < rows) && (j == 1 || j == 7)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
