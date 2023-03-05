import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // As with Strings, use equals() with arrays, not ==
        int[] a = new int[10];
        System.out.println(a.length);

        int[] d1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] d2 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int[][][] d3 = {{{0, 1}, {2, 3}},
                        {{4, 5}, {6, 7}},
                        {{8, 9}, {10, 11}}};

        Arrays.fill(a, 5);
        System.out.println(Arrays.toString(a));
        System.out.println();

        // The array must be sorted before binarySearch()
        int[] searchTarget = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println(Arrays.binarySearch(searchTarget, 77)); // returns insertion point if element is not found
        System.out.println();

        int[] mess = {5, 7, 3, 9, 8, 1, 4, 2, 6,}; //Notice the last comma is legal
        Arrays.sort(mess);
        System.out.println(Arrays.toString(mess));

        int[] copiedMess = Arrays.copyOf(mess, mess.length);
        System.out.println(Arrays.toString(copiedMess));

        int[] smallerMess = Arrays.copyOf(mess, 5);
        System.out.println(Arrays.toString(smallerMess));
    }
}
