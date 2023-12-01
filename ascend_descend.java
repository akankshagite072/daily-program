import java.util.Scanner;

public class ascend_descend {
    static int cal, size = 5;
    static int[] n = new int[size];

    public static void main(String[] args) {

        accept();
        GRT();
        smaller();
        ascending();
        descending();

    }

    public static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();

        System.out.println("Enter " + size + " numbers");
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
    }

    public static void GRT() {

        cal = n[0];
        System.out.println("The numbers are");
        for (int i = 0; i < size; i++) {
            System.out.println("num=" + n[i]);
            if (n[i] > cal) {
                cal = n[i];
            }

        }
        System.out.println("The graeter no is =" + cal);
    }

    public static void smaller() {

        cal = n[0];
        for (int i = 0; i < size; i++) {
            if (n[i] < cal) {
                cal = n[i];
            }

        }
        System.out.println("The Smaller no is =" + cal);
    }

    public static void ascending() {
        System.out.println("Array Element is Ascending Order");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (n[i] > n[j]) {
                    int t = n[i];
                    n[i] = n[j];
                    n[j] = t;
                }
            }
            System.out.print(n[i] + "\t");
        }
        System.out.println();
    }

    public static void descending() {
        System.out.println("Array Element is Descending Order");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (n[i] < n[j]) {
                    int t = n[i];
                    n[i] = n[j];
                    n[j] = t;
                }
            }
            System.out.print(n[i] + "\t");
        }
        System.out.println();
    }

}
