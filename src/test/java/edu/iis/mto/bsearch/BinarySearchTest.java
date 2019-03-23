package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BinarySearchTest {

    private static final int ELEMENT = 2;

    @Test
    public void elementInSequenceTest() {
        int[] sequence = {ELEMENT};

        Assert.assertThat(true, is(equalTo(BinarySearch.search(ELEMENT, sequence).isFound())));
        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test
    public void elementNotInSingleSequenceTest() {
        int[] sequence = {ELEMENT + 1};

        Assert.assertThat(false, is(equalTo((BinarySearch.search(ELEMENT, sequence).isFound()))));
        Assert.assertThat(-1, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
    }

    @Test
    public void elementFirstInSequenceTest() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test
    public void elementLastInSequenceTest() {
        int[] sequence = {ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT};

        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test public void elementMiddleInSequenceTest() {
        int[] sequence = {ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};

        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test
    public void elementNotInMultiSequenceTest() {
        int[] sequence = {ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertThat(-1, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchElementInEmptySequenceTest() {
        int[] sequence = {};

        BinarySearch.search(ELEMENT, sequence);
    }

    @Test
    public void searchNegativeElementInSequenceTest() {
        int[] sequence = {ELEMENT - 4, ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};
        int key = ELEMENT - 4;

        Assert.assertThat(key, is(equalTo(sequence[BinarySearch.search(key, sequence).getPosition()])));
    }

    @Test
    public void searchElementInSequenceContainsSameElementsTest() {
        int[] sequence = {ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT};

        Assert.assertThat((sequence.length - 1) / 2, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
    }
}
