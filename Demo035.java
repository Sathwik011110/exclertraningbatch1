import java.util.Scanner;

public class Demo035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        long num1 = scanner.nextLong();

        System.out.print("Enter the second number: ");
        long num2 = scanner.nextLong();

        if (num1 > num2) {
            System.out.println(num1 + " is larger.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}