public class Strings {
    public static void main(String[] args) {
        String s = "Hope for the best, prepare for the worst.";

        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println();

        System.out.println(s.equals("Let there be a string!"));
        System.out.println(s.equals(s.toLowerCase()));
        System.out.println(s.equalsIgnoreCase(s.toLowerCase()));
        System.out.println();

        System.out.println(s.contains("Hope"));
        System.out.println(s.contains("hope"));
        System.out.println(s.charAt(0));
        System.out.println();

        System.out.println(s.indexOf("best")); // Would give -1 if not found
        System.out.println(s.replace("prepare", "but be ready"));
        System.out.println("Bingo".substring(1, 4)); // First index is inclusive, second is not
        System.out.println();

        for (String word: s.split(" ")) { // Splitting by "" turns the string into a char array
            System.out.print(word + "   ");
        }
    }
}
