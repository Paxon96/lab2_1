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

}
