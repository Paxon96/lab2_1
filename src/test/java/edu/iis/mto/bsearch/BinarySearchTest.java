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
    public void elementNotInSingleSequenceTest(){
        int[] sequence = {ELEMENT+1};

        Assert.assertFalse(BinarySearch.search(ELEMENT, sequence).isFound());
    }
}
