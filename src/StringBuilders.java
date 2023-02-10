public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(64); // Capacity of the StringBuilder in bytes
        StringBuilder sb2 = new StringBuilder("To be or not to be"); // Start with a string

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(200);
        System.out.println(sb2.capacity());
        System.out.println();

        sb2.append(" that is the questionZ?");
        System.out.println(sb2);
        System.out.println(sb2.append("right?"));
        int idx = sb2.indexOf("right?");
        System.out.println(sb2.delete(idx, idx+7));
        System.out.println(sb2.deleteCharAt(sb2.length() - 2));
        System.out.println();

        StringBuilder sb3 = new StringBuilder("Comter");
        System.out.println(sb3.insert(3, "pZZZ"));
        System.out.println(sb3.replace(4, 7, "u")); //Both indexes are inclusive here

        //substring(), charAt(), indexOf() also work.
    }
}
