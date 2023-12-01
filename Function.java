import java.util.Scanner;

public class Function {

    static int i, cal, size = 5;
    static int[] num = new int[size];

    public static void main(String[] args) {
        GRT();

    }

    public static void accept() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();

        System.out.println("Enter " + size + " numbers");
        for (i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
    }

    public static void GRT() {
        accept();
        cal = num[0];
        System.out.println("The numbers are");
        for (i = 0; i < size; i++) {
            System.out.println("num=" + num[i]);
            if (num[i] > cal) {
                cal = num[i];
            }

        }
        System.out.println("The graeter no is =" + cal);
    }

}
