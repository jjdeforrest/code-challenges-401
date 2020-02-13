package MergeSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {

        int[] ari = new int[]{13,3,11,29,38};
        int[] expected = new int[]{3,11,13,29,38};
        MergeSort.mergeSort(ari);
        assertArrayEquals("Array should be sorted",expected,ari);
    }

    @Test
    public void reversesortedTest() {

        int[] ari = new int[]{20,18,12,8,5, -2};
        int[] expected = new int[]{-2,5,8,12,18,20};
        MergeSort.mergeSort(ari);
        assertArrayEquals("Array should be sorted",expected,ari);
    }

    @Test
    public void fewuniquesTest() {

        int[] ari = new int[]{5,12,7,5,5,7};
        int[] expected = new int[]{5,5,5,7,7,12};
        MergeSort.mergeSort(ari);
        assertArrayEquals("Array should be sorted",expected,ari);
    }

    @Test
    public void nearlysorteTest() {

        int[] ari = new int[]{2,3,5,7,13,11};
        int[] expected = new int[]{2,3,5,7,11,13};
        MergeSort.mergeSort(ari);
        assertArrayEquals("Array should be sorted",expected,ari);
    }


}



