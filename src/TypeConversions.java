public class TypeConversions {
    public static void main(String[] args) {
        // CASTING
        short s = 57;
        int i1 = s; // Small->Big casts are automatic (aka Widening)
        System.out.println(i1);

        long l = 734687723;
        System.out.println(l);
        int i2 = (int) l; //Big->Small casts need to be done like this (aka Narrowing)

        float floatingPI = 3.14159f;
        int intPI = (int) floatingPI;
        System.out.println(intPI); //BEWARE: Narrowing may result in data loss


        // CONVERSION METHODS

        // There are similar .parseXXX() methods for all primitive types except the char type
        System.out.println(Integer.parseInt("8848"));

        // There are similar .toString() methods for all primitive types
        System.out.println(Integer.toString(6732));

        // Gets the actual digit represented by the character (not the ASCII value)
        System.out.println(Character.getNumericValue('9'));
    }
}
