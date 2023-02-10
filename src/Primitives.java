public class Primitives {
    public static void main(String[] args) {
        byte b = 23;
        short s = 46;
        int i = 78;
        long l = 84845888420487L; // Notice the L
        float f = 8.37524f; // Notice the f
        double d = 5.94756382048; // 5.94756382048d is valid but not needed
        char c = 'C'; // Single quotes are mandatory for chars
        boolean bool = true; // or false

        System.out.println("Byte max: " + Byte.MAX_VALUE);
        System.out.println("Short max: " + Short.MAX_VALUE);
        System.out.println("Integer max: " + Integer.MAX_VALUE);
        System.out.println("Long max: " + Long.MAX_VALUE);
        System.out.println("Float max: " + Float.MAX_VALUE);
        System.out.println("Double max: " + Double.MAX_VALUE);
    }
}
