package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    private static final int ELEMENT = 2;

    @Test
    public void elementInSequenceTest() {
        int[] sequence = {ELEMENT};

        Assert.assertTrue(BinarySearch.search(ELEMENT, sequence).isFound());
        Assert.assertEquals(ELEMENT, sequence[BinarySearch.search(ELEMENT, sequence).getPosition()]);
    }

    @Test
    public void elementNotInSingleSequenceTest() {
        int[] sequence = {ELEMENT + 1};

        Assert.assertFalse(BinarySearch.search(ELEMENT, sequence).isFound());
        Assert.assertEquals(-1, BinarySearch.search(ELEMENT, sequence).getPosition());
    }

    @Test
    public void elementFirstInSequenceTest() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertEquals(ELEMENT, sequence[BinarySearch.search(ELEMENT, sequence).getPosition()]);
    }

    @Test
    public void elementLastInSequenceTest() {
        int[] sequence = {ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT};

       Assert.assertEquals(ELEMENT, sequence[BinarySearch.search(ELEMENT, sequence).getPosition()]);
    }

    @Test
    public void elementMiddleInSequenceTest() {
        int[] sequence = {ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};

        Assert.assertEquals(ELEMENT, sequence[BinarySearch.search(ELEMENT, sequence).getPosition()]);
    }

    @Test
    public void elementNotInMultiSequenceTest() {
        int[] sequence = {ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertEquals(-1, BinarySearch.search(ELEMENT, sequence).getPosition());
    }

    @Test
    public void searchElementInEmptySequenceTest(){
        int[] sequence = {};


        Assert.assertEquals(-1, BinarySearch.search(ELEMENT,sequence).getPosition());
    }

    @Test
    public void searchNegativeElementInSequenceTest(){
        int[] sequence = {ELEMENT - 4, ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};
        int key = ELEMENT - 4;

        Assert.assertEquals(key, sequence[BinarySearch.search(key, sequence).getPosition()]);
    }
}
