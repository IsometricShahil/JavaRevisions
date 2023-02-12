import java.util.Arrays;

public class Varargs {
    static void f(int ...a) {
        // a is taken as an int[]
        System.out.println(Arrays.toString(a));
    }

    static void g(int a, char b, int ...c) {
        System.out.println("First value: " + a);
        System.out.println("Second value: " + b);
        System.out.println("The rest: " + Arrays.toString(c));
    }
    public static void main(String[] args) {
        f();
        f(1, 3, 5, 7, 9);
        System.out.println();
        g(56, 'Z', 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
    }
}
