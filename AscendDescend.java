import java.util.Arrays;
import java.util.Scanner;

public class AscendDescend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nArray in ascending order:");
        printArray(ascendingOrder(array));

        System.out.println("\nArray in descending order:");
        printArray(descendingOrder(array));

        scanner.close();
    }

    private static int[] ascendingOrder(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    private static int[] descendingOrder(int[] arr) {
        Arrays.sort(arr);
        int[] descendingArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            descendingArr[i] = arr[arr.length - 1 - i];
        }
        return descendingArr;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
