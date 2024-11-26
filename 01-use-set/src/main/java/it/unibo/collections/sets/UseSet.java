package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Collection<String> tree = new TreeSet<String>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for (int i = 1; i <= 20; i++) {
            tree.add(String.valueOf(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(tree);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        for (String str : tree) {
            if (Integer.parseInt(str) % 3 == 0) {
                tree.remove(str);
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (String str : tree) {
            System.out.println(str);
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean even = false;
        for (String str : tree) {
            if (Integer.parseInt(str)%2 == 0) {
                even = true;
            }
        }
        System.out.println("All the numbers in set are: " + String.valueOf(even));
    }
}
