import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowingExceptions {
    static void divide(int a, int b) {
        System.out.println(a / b);
    }

    static void ask() {
        System.out.print("Enter a decimal to trigger Error: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }

    static void customThrow() throws Exception { // You need exceptions in method signature to throw exceptions
        throw new Exception("Oops!");
    }

    static void customThrow2() { // But not if you handle the exception in your function
        try {
            throw new Exception("Oops!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            divide(9, 0); // Throws ArithmeticException
        } catch(ArithmeticException ex) {
            ex.printStackTrace();
        }

        try {
            ask(); // Throws InputMismatchException
        } catch(InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
