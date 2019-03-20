package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    private static final int ELEMENT = 2;

    @Test
    public void elementInSequenceTest() {
        int[] sequence = {ELEMENT};

        Assert.assertTrue(BinarySearch.search(ELEMENT, sequence).isFound());
    }

    @Test
    public void elementNotInSingleSequenceTest() {
        int[] sequence = {ELEMENT + 1};

        Assert.assertFalse(BinarySearch.search(ELEMENT, sequence).isFound());
    }

    @Test
    public void elementFirstInSequenceTest() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertEquals(1, BinarySearch.search(ELEMENT, sequence).getPosition());
    }

    @Test
    public void elementLastInSequenceTest() {
        int[] sequence = {ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT};

        Assert.assertEquals(sequence.length, BinarySearch.search(ELEMENT, sequence).getPosition());
    }

    @Test
    public void elementMiddleInSequenceTest() {
        int[] sequence = {ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};

        Assert.assertEquals((sequence.length/2) +1, BinarySearch.search(ELEMENT, sequence).getPosition());
    }
}
