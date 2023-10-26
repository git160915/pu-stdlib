package edu.princeton.cs.introcs;

import edu.princeton.cs.introcs.StdOut;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StdOutTest {
    /**
     * Testing StdOut, it should print to standard output without exception
     */
    @Test
    public void checkStdOut()
    {
        StdOut.println("");
        StdOut.println("Testing StdOut");
        StdOut.println("");

        assertTrue( true );
    }
}
