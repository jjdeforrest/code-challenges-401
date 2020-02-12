package InsertionSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static InsertionSort.InsertionSort.insertionSort;
import static org.junit.Assert.*;

public class InsertionSortTest {


    int[] testArr;

    @Before
    public void setup(){
        testArr = new int[]{11,19,27,7,12,13};
    }

    @Test
    public void testInsertionSort() {
        int[] joker = new int[]{7, 11, 12, 13, 19, 27};
        insertionSort(testArr);
        assertArrayEquals(joker, testArr);
    }

    @Test
    public void testInsertionSort_negativeValues() {
        testArr = new int[]{3,-3,-9,5,9,7};
        int[] resultArr = new int[]{-9, -3, 3, 5, 7, 9};
        insertionSort(testArr);
        assertArrayEquals(resultArr, testArr);
    }

    @Test
    public void testInsertionSort_duplicateValues() {
        testArr = new int[]{2,17,9,2,5,2};
        int[] resultArr = new int[]{2, 2, 2, 5, 9, 17};
        insertionSort(testArr);
        assertArrayEquals(resultArr, testArr);
    }

}