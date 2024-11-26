package it.unibo.collections.comparators;

import java.util.Comparator;

/**
 * The comparator must convert the strings to double, then compare the doubles to find the biggest.
 * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
 */
public class StringByDoubleBigger implements Comparator<String> {
    
    public int compare (final String s1, final String s2) {
        final double ds1 = Double.parseDouble(s1);
        final double ds2 = Double.parseDouble(s2);

        final var byDouble = Double.compare(ds1, ds2);
        
        return byDouble;
    }
    
}
