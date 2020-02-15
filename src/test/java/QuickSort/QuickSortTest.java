package QuickSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {


    @Test
    public void quicksorttest() {

        int[] arr = new int[]{13,3,11,29,38};
        int[] expected = new int[]{3,11,13,29,38};
        QuickSort.quickSort(arr, 0, 4);
        assertArrayEquals("should be sorted",expected,arr);
    }

//    @Test
//    public void reversesortedTest() {
//
//        int[] arr = new int[]{20,18,12,8,5, -2};
//        int[] expected = new int[]{-2,5,8,12,18,20};
//        QuickSort.quickSort(arr, 0, -2);
//        assertArrayEquals("should be sorted",expected,arr);
//    }
////
//    @Test
//    public void fewuniquesTest() {
//
//        int[] arr = new int[]{5,12,7,5,5,7};
//        int[] expected = new int[]{5,5,5,7,7,12};
//        QuickSort.quickSort(ari);
//        assertArrayEquals("should be sorted",expected,arr);
//    }
//
//    @Test
//    public void nearlysorteTest() {
//
//        int[] arr = new int[]{2,3,5,7,13,11};
//        int[] expected = new int[]{2,3,5,7,11,13};
//        QuickSort.quickSort(arr);
//        assertArrayEquals("should be sorted",expected,arr);
//    }


}

