/*Write a program to perform the choice
1:Sum of digit
2:Prime No
3:Fibonacci series
Using Function*/
import java.util.Scanner;

public class Choice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1: Sum of digits");
        System.out.println("2: Prime number check");
        System.out.println("3: Fibonacci series");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a number:");
                int num1 = scanner.nextInt();
                int sum = sum(num1);
                System.out.println("Sum of digits: " + sum);
                break;
            case 2:
                System.out.println("Enter a number:");
                int num2 = scanner.nextInt();
                boolean isPrime = Prime(num2);
                System.out.println("Is prime: " + isPrime);
                break;
            case 3:
                System.out.println("Enter the length of Fibonacci series:");
                int length = scanner.nextInt();
                Fibonacci(length);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Fibonacci(int length) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series:");
        for (int i = 0; i < length; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
